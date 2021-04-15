package uk.kcl.pgt.mdd.cw.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameLexer extends Lexer {
    public static final int RULE_OBJTYPE=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_KEYSTROKE=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalGameLexer() {;} 
    public InternalGameLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGameLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGame.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:11:7: ( '==' )
            // InternalGame.g:11:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:12:7: ( '<' )
            // InternalGame.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:13:7: ( '<=' )
            // InternalGame.g:13:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:14:7: ( '+' )
            // InternalGame.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:15:7: ( '-' )
            // InternalGame.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:16:7: ( '*' )
            // InternalGame.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:17:7: ( '/' )
            // InternalGame.g:17:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:18:7: ( '!' )
            // InternalGame.g:18:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:19:7: ( 'game' )
            // InternalGame.g:19:9: 'game'
            {
            match("game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:20:7: ( '(' )
            // InternalGame.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:21:7: ( ')' )
            // InternalGame.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:22:7: ( ';' )
            // InternalGame.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:23:7: ( '=' )
            // InternalGame.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:24:7: ( '[' )
            // InternalGame.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:25:7: ( ']' )
            // InternalGame.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:26:7: ( ',' )
            // InternalGame.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:27:7: ( '{' )
            // InternalGame.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:28:7: ( '}' )
            // InternalGame.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:29:7: ( 'if' )
            // InternalGame.g:29:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:30:7: ( 'else' )
            // InternalGame.g:30:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:31:7: ( 'while' )
            // InternalGame.g:31:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:32:7: ( 'for' )
            // InternalGame.g:32:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:33:7: ( 'exit' )
            // InternalGame.g:33:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:34:7: ( '.' )
            // InternalGame.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:35:7: ( 'animation' )
            // InternalGame.g:35:9: 'animation'
            {
            match("animation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:36:7: ( 'on' )
            // InternalGame.g:36:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:37:7: ( 'int' )
            // InternalGame.g:37:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:38:7: ( '||' )
            // InternalGame.g:38:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:39:7: ( '&&' )
            // InternalGame.g:39:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:40:7: ( 'touches' )
            // InternalGame.g:40:9: 'touches'
            {
            match("touches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_OBJTYPE"
    public final void mRULE_OBJTYPE() throws RecognitionException {
        try {
            int _type = RULE_OBJTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5396:14: ( ( 'rectangle' | 'circle' | 'triangle' ) )
            // InternalGame.g:5396:16: ( 'rectangle' | 'circle' | 'triangle' )
            {
            // InternalGame.g:5396:16: ( 'rectangle' | 'circle' | 'triangle' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt1=1;
                }
                break;
            case 'c':
                {
                alt1=2;
                }
                break;
            case 't':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGame.g:5396:17: 'rectangle'
                    {
                    match("rectangle"); 


                    }
                    break;
                case 2 :
                    // InternalGame.g:5396:29: 'circle'
                    {
                    match("circle"); 


                    }
                    break;
                case 3 :
                    // InternalGame.g:5396:38: 'triangle'
                    {
                    match("triangle"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBJTYPE"

    // $ANTLR start "RULE_KEYSTROKE"
    public final void mRULE_KEYSTROKE() throws RecognitionException {
        try {
            int _type = RULE_KEYSTROKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5398:16: ( ( 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' ) )
            // InternalGame.g:5398:18: ( 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' )
            {
            // InternalGame.g:5398:18: ( 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt2=1;
                }
                break;
            case 'r':
                {
                alt2=2;
                }
                break;
            case 'u':
                {
                alt2=3;
                }
                break;
            case 'd':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:5398:19: 'leftarrow'
                    {
                    match("leftarrow"); 


                    }
                    break;
                case 2 :
                    // InternalGame.g:5398:31: 'rightarrow'
                    {
                    match("rightarrow"); 


                    }
                    break;
                case 3 :
                    // InternalGame.g:5398:44: 'uparrow'
                    {
                    match("uparrow"); 


                    }
                    break;
                case 4 :
                    // InternalGame.g:5398:54: 'downarrow'
                    {
                    match("downarrow"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYSTROKE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5400:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGame.g:5400:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGame.g:5400:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:5400:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGame.g:5400:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5402:10: ( ( '0' .. '9' )+ )
            // InternalGame.g:5402:12: ( '0' .. '9' )+
            {
            // InternalGame.g:5402:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:5402:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5404:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGame.g:5404:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGame.g:5404:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:5404:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGame.g:5404:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGame.g:5404:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGame.g:5404:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGame.g:5404:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGame.g:5404:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGame.g:5404:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGame.g:5404:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5406:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGame.g:5406:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGame.g:5406:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:5406:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5408:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGame.g:5408:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGame.g:5408:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:5408:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalGame.g:5408:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:5408:41: ( '\\r' )? '\\n'
                    {
                    // InternalGame.g:5408:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGame.g:5408:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5410:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGame.g:5410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGame.g:5410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGame.g:5412:16: ( . )
            // InternalGame.g:5412:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGame.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_OBJTYPE | RULE_KEYSTROKE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=39;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalGame.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGame.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGame.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGame.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGame.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGame.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGame.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGame.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGame.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGame.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGame.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGame.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGame.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGame.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGame.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalGame.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalGame.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalGame.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalGame.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalGame.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalGame.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalGame.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalGame.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalGame.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalGame.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalGame.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalGame.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalGame.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalGame.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalGame.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalGame.g:1:190: RULE_OBJTYPE
                {
                mRULE_OBJTYPE(); 

                }
                break;
            case 32 :
                // InternalGame.g:1:203: RULE_KEYSTROKE
                {
                mRULE_KEYSTROKE(); 

                }
                break;
            case 33 :
                // InternalGame.g:1:218: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalGame.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalGame.g:1:235: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalGame.g:1:247: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalGame.g:1:263: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalGame.g:1:279: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalGame.g:1:287: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\50\1\52\3\uffff\1\60\1\uffff\1\63\10\uffff\4\63\1\uffff\2\63\2\46\6\63\1\46\2\uffff\2\46\15\uffff\1\63\11\uffff\1\123\5\63\1\uffff\1\63\1\132\2\uffff\10\63\3\uffff\1\63\1\uffff\1\144\3\63\1\150\1\63\1\uffff\10\63\1\162\1\uffff\1\163\1\164\1\63\1\uffff\11\63\3\uffff\1\177\11\63\1\uffff\5\63\1\u008e\4\63\1\u0093\3\63\1\uffff\1\63\1\u0098\2\63\1\uffff\1\u008e\3\63\1\uffff\1\63\1\u009f\1\u008e\1\63\2\u0098\1\uffff\1\u0098";
    static final String DFA14_eofS =
        "\u00a1\uffff";
    static final String DFA14_minS =
        "\1\0\2\75\3\uffff\1\52\1\uffff\1\141\10\uffff\1\146\1\154\1\150\1\157\1\uffff\2\156\1\174\1\46\1\157\1\145\1\151\1\145\1\160\1\157\1\101\2\uffff\2\0\15\uffff\1\155\11\uffff\1\60\1\164\1\163\2\151\1\162\1\uffff\1\151\1\60\2\uffff\1\165\1\151\1\143\1\147\1\162\1\146\1\141\1\167\3\uffff\1\145\1\uffff\1\60\1\145\1\164\1\154\1\60\1\155\1\uffff\1\143\1\141\1\164\1\150\1\143\1\164\1\162\1\156\1\60\1\uffff\2\60\1\145\1\uffff\1\141\1\150\1\156\1\141\1\164\1\154\1\141\1\162\1\141\3\uffff\1\60\1\164\1\145\1\147\1\156\1\141\1\145\1\162\1\157\1\162\1\uffff\1\151\1\163\1\154\1\147\1\162\1\60\1\162\1\167\1\162\1\157\1\60\1\145\1\154\1\162\1\uffff\1\157\1\60\1\157\1\156\1\uffff\1\60\1\145\1\157\1\167\1\uffff\1\167\2\60\1\167\2\60\1\uffff\1\60";
    static final String DFA14_maxS =
        "\1\uffff\2\75\3\uffff\1\57\1\uffff\1\141\10\uffff\1\156\1\170\1\150\1\157\1\uffff\2\156\1\174\1\46\1\162\2\151\1\145\1\160\1\157\1\172\2\uffff\2\uffff\15\uffff\1\155\11\uffff\1\172\1\164\1\163\2\151\1\162\1\uffff\1\151\1\172\2\uffff\1\165\1\151\1\143\1\147\1\162\1\146\1\141\1\167\3\uffff\1\145\1\uffff\1\172\1\145\1\164\1\154\1\172\1\155\1\uffff\1\143\1\141\1\164\1\150\1\143\1\164\1\162\1\156\1\172\1\uffff\2\172\1\145\1\uffff\1\141\1\150\1\156\1\141\1\164\1\154\1\141\1\162\1\141\3\uffff\1\172\1\164\1\145\1\147\1\156\1\141\1\145\1\162\1\157\1\162\1\uffff\1\151\1\163\1\154\1\147\1\162\1\172\1\162\1\167\1\162\1\157\1\172\1\145\1\154\1\162\1\uffff\1\157\1\172\1\157\1\156\1\uffff\1\172\1\145\1\157\1\167\1\uffff\1\167\2\172\1\167\2\172\1\uffff\1\172";
    static final String DFA14_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\uffff\1\10\1\uffff\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\4\uffff\1\30\13\uffff\1\41\1\42\2\uffff\1\46\1\47\1\1\1\15\1\3\1\2\1\4\1\5\1\6\1\44\1\45\1\7\1\10\1\uffff\1\41\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\6\uffff\1\30\2\uffff\1\34\1\35\10\uffff\1\42\1\43\1\46\1\uffff\1\23\6\uffff\1\32\11\uffff\1\33\3\uffff\1\26\11\uffff\1\11\1\24\1\27\12\uffff\1\25\16\uffff\1\37\4\uffff\1\36\4\uffff\1\40\6\uffff\1\31\1\uffff";
    static final String DFA14_specialS =
        "\1\1\42\uffff\1\2\1\0\174\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\7\1\43\3\46\1\31\1\44\1\11\1\12\1\5\1\3\1\16\1\4\1\25\1\6\12\42\1\46\1\13\1\2\1\1\3\46\32\41\1\14\1\46\1\15\1\40\1\41\1\46\1\26\1\41\1\34\1\37\1\22\1\24\1\10\1\41\1\21\2\41\1\35\2\41\1\27\2\41\1\33\1\41\1\32\1\36\1\41\1\23\3\41\1\17\1\30\1\20\uff82\46",
            "\1\47",
            "\1\51",
            "",
            "",
            "",
            "\1\56\4\uffff\1\57",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\7\uffff\1\75",
            "\1\76\13\uffff\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107\2\uffff\1\110",
            "\1\111\3\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\0\120",
            "\0\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "\1\143",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0099",
            "\1\u009a",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_OBJTYPE | RULE_KEYSTROKE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( ((LA14_36>='\u0000' && LA14_36<='\uFFFF')) ) {s = 80;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='=') ) {s = 1;}

                        else if ( (LA14_0=='<') ) {s = 2;}

                        else if ( (LA14_0=='+') ) {s = 3;}

                        else if ( (LA14_0=='-') ) {s = 4;}

                        else if ( (LA14_0=='*') ) {s = 5;}

                        else if ( (LA14_0=='/') ) {s = 6;}

                        else if ( (LA14_0=='!') ) {s = 7;}

                        else if ( (LA14_0=='g') ) {s = 8;}

                        else if ( (LA14_0=='(') ) {s = 9;}

                        else if ( (LA14_0==')') ) {s = 10;}

                        else if ( (LA14_0==';') ) {s = 11;}

                        else if ( (LA14_0=='[') ) {s = 12;}

                        else if ( (LA14_0==']') ) {s = 13;}

                        else if ( (LA14_0==',') ) {s = 14;}

                        else if ( (LA14_0=='{') ) {s = 15;}

                        else if ( (LA14_0=='}') ) {s = 16;}

                        else if ( (LA14_0=='i') ) {s = 17;}

                        else if ( (LA14_0=='e') ) {s = 18;}

                        else if ( (LA14_0=='w') ) {s = 19;}

                        else if ( (LA14_0=='f') ) {s = 20;}

                        else if ( (LA14_0=='.') ) {s = 21;}

                        else if ( (LA14_0=='a') ) {s = 22;}

                        else if ( (LA14_0=='o') ) {s = 23;}

                        else if ( (LA14_0=='|') ) {s = 24;}

                        else if ( (LA14_0=='&') ) {s = 25;}

                        else if ( (LA14_0=='t') ) {s = 26;}

                        else if ( (LA14_0=='r') ) {s = 27;}

                        else if ( (LA14_0=='c') ) {s = 28;}

                        else if ( (LA14_0=='l') ) {s = 29;}

                        else if ( (LA14_0=='u') ) {s = 30;}

                        else if ( (LA14_0=='d') ) {s = 31;}

                        else if ( (LA14_0=='^') ) {s = 32;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='h'||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='n')||(LA14_0>='p' && LA14_0<='q')||LA14_0=='s'||LA14_0=='v'||(LA14_0>='x' && LA14_0<='z')) ) {s = 33;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 34;}

                        else if ( (LA14_0=='\"') ) {s = 35;}

                        else if ( (LA14_0=='\'') ) {s = 36;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 37;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0==':'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 80;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}