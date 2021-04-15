// Global game-framework vars
var canvas;
var context;

var Game = { w: 500, h: 500, x: 300, y: 200 }

// Global variables
var i = 0;
var number = 5;

// Animations
function lead_alien_animate(lead_alien) {
 if(Game.w - 100 < lead_alien.x + lead_alien.xspeed || lead_alien.x + lead_alien.xspeed < 100) {
  lead_alien.xspeed = -lead_alien.xspeed;
 } 
 if(Game.h - 100 < lead_alien.y + lead_alien.yspeed || lead_alien.y + lead_alien.yspeed < 100) {
  lead_alien.yspeed = -lead_alien.yspeed;
 } 
 lead_alien.x = lead_alien.x + lead_alien.xspeed;
 lead_alien.y = lead_alien.y + lead_alien.yspeed;
}

function gun_animate(gun) {
 if(gun.visible) {
  for(i = 0; i < number; i = i + 1) {
   if(obstacles[i].visible && touches(protector, obstacles[i])) {
    obstacles[i].visible = 0;
    gun.visible = 0;
    alert('game over!!!');
   } 
  }
 } 
}

var obstacles = [createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle)];
var protector = {x: 250, y: 100, w: 25, h: 12, type: objTypes.Rectangle, visible: 1};

var gameObjs = [obstacles, protector]

// KeyEvents
function leftarrow() {
 if(100 < protector.x) {
  protector.x = protector.x - 5;
 } 
}

function rightarrow() {
 if(protector.x < Game.w - 100) {
  protector.x = protector.x + 5;
 } 
}

function uparrow() {
 if(100 < protector.y) {
  protector.y = protector.y - 5;
 } 
}

function downarrow() {
 if(protector.y < Game.h - 100) {
  protector.y = protector.y + 5;
 } 
}

// KeyMap to work with in the input loop
var keyMap = new Map();
keyMap.set('ArrowLeft', { keydown: false, onDown: leftarrow });
keyMap.set('ArrowRight', { keydown: false, onDown: rightarrow });
keyMap.set('ArrowUp', { keydown: false, onDown: uparrow });
keyMap.set('ArrowDown', { keydown: false, onDown: downarrow });

for(i = 0; i < number; i = i + 1) {
 obstacles[i].r = 10;
 obstacles[i].anim = lead_alien_animate;
}
protector.anim = gun_animate;
obstacles[0].x = 106;
obstacles[0].y = 310;
obstacles[0].xspeed = 6;
obstacles[0].yspeed = -6;
obstacles[1].x = 300;
obstacles[1].y = 220;
obstacles[1].xspeed = 3;
obstacles[1].yspeed = -4;
obstacles[2].x = 120;
obstacles[2].y = 289;
obstacles[2].xspeed = 1;
obstacles[2].yspeed = -1;
obstacles[3].x = 111;
obstacles[3].y = 398;
obstacles[3].xspeed = 1;
obstacles[3].yspeed = 1;
obstacles[4].x = 200;
obstacles[4].y = 200;
obstacles[4].xspeed = 3;
obstacles[4].yspeed = 7;

window.onload = function(){
 canvas = document.getElementById('gameCanvas');
 context = canvas.getContext('2d');
   
 window.addEventListener('keydown', (e) => {
  if (keyMap.has(e.key)) {
   keyMap.get(e.key).keydown = true;
  }
 }, true);
   
 window.addEventListener('keyup', (e) => {
  if (keyMap.has(e.key)) {
   keyMap.get(e.key).keydown = false;
  }
 }, true);
   
 window.requestAnimationFrame(gameLoop);
 window.requestAnimationFrame(inputLoop);
}

function gameLoop() {
    // blank fill background
    context.fillStyle = 'white';
    context.fillRect(0, 0, canvas.width, canvas.height);

    // Animate and draw objects
    gameObjs.forEach(obj => {
     if (Array.isArray(obj)) {
      obj.forEach(x => {
       if (x.anim) {
        x.anim(x)
       }
      })
     } else {
      if (obj.anim) {
       obj.anim(obj);
      }
     }
     draw(obj);
    });

    // request next animation frame
    window.setTimeout(() => window.requestAnimationFrame(gameLoop), 1000 / undefined);
}

function inputLoop() {
    // Execute input updates
    keyMap.forEach((value, key) => {
        if (value.keydown) {
            value.onDown();
        }
    });

    // blank fill background
    context.fillStyle = 'white';
    context.fillRect(0, 0, canvas.width, canvas.height);

    // Animate and draw objects
    gameObjs.forEach(obj => {
        draw(obj);
    });

    window.setTimeout(() => window.requestAnimationFrame(inputLoop), 1000 / undefined);
}
