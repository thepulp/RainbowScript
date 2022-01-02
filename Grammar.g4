grammar Grammar;

@parser::header {

    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
}

@parser::members{
    Map<String, Object> sTable = new HashMap<String, Object>();
}


program: PROGRAM ID BRACKET_OPEN
            {
                List<ASTNode> body = new ArrayList<ASTNode>();
                Map<String, Object> sTable = new HashMap<String, Object>();
            }
            (sentence { body.add($sentence.node); })*
BRACKET_CLOSE
{
    for(ASTNode n : body)
    {
        n.execute(sTable);
    }
}
;

sentence returns [ASTNode node]:
            var_decl
                {   $node = $var_decl._var;     }
            |
            var_assing
                {   $node = $var_assing._var;   }
            |
            println
                { $node = $println.node;        }

            |
            conditional
                { $node = $conditional.node;    }
            |
            cyclical
                { $node = $cyclical.node;       }
            |
            docyclical
                { $node = $docyclical.node;     }
            |
            square
                { $node = $square.node;         }
            |
            pow
                { $node = $pow.node;            }
            ;


var_decl returns [ASTNode _var]: VAR ID SEMICOLON
    {
        $_var = new VarDecl($ID.text);
    }
;

var_assing returns [ASTNode _var]: ID ASSING expression SEMICOLON
    {
        $_var = new VarAssing($ID.text, $expression.node);
    }
;


println returns [ASTNode node]: PRINTLN expression SEMICOLON
    {
        $node = new Println($expression.node);
    }
;


conditional returns [ASTNode node]:
                IF PAR_OPEN expression PAR_CLOSE
                    {
                        List<ASTNode> body = new ArrayList<ASTNode>();
                        List<ASTNode> bodyElse = new ArrayList<ASTNode>();
                        $node = new If($expression.node, body, bodyElse);
                    }
                    BRACKET_OPEN ( s1 = sentence { body.add($s1.node); })*  BRACKET_CLOSE
              (
                ELSE
                    BRACKET_OPEN ( s2 = sentence { bodyElse.add($s2.node); })  BRACKET_CLOSE
              )?

;
//--------------------------Código Implementado para los ejercicios------------------------------------------
//Gramatica para implementar el while
cyclical returns [ASTNode node]:
                WHILE PAR_OPEN expression PAR_CLOSE
                    {
                        List<ASTNode> body = new ArrayList<ASTNode>();
                        $node = new While($expression.node, body);
                    }
                    BRACKET_OPEN ( s1 = sentence { body.add($s1.node); })*  BRACKET_CLOSE
;


//Gramatica para implementar el do while ó do repeat
docyclical returns [ASTNode node]:

                DO BRACKET_OPEN
                    {
                        List<ASTNode> body = new ArrayList<ASTNode>();

                    }
                (s1 = sentence { body.add($s1.node); })* BRACKET_CLOSE
                WHILE PAR_OPEN expression PAR_CLOSE
                    {      $node = new DoRepeat($expression.node, body);}
                ;


//Gramatica para implementar el square: cuadrado de un número
square returns [ASTNode node]:
                SQUARE expression SEMICOLON
                    {
                        $node = new Cuadrado($expression.node);
                    }

;
//Gramatica para implementar el pow: potencia de un número
pow returns [ASTNode node]:
                POW PAR_OPEN e1 = expression { $node = $e1.node; }
                COMA e2 = expression { $node = new Exponencial($node, $e2.node);  }
                PAR_CLOSE SEMICOLON
;
//Gramatica para implementar el Not: el falso de una expresión
/*not returns [ASTNode node]:
                NOT PAR_OPEN expression PAR_CLOSE
                    {
                        $node = new Not($expression.node);
                    }

;*/
//--------------------------------------------------------------------------------------------

expression returns [ASTNode node]: t1 = factor {    $node = $t1.node;   }
    (       PLUS        t2 = factor {     $node = new Addition($node, $t2.node);    }
            |
            MINUS       t2 = factor {   $node = new Minus($node, $t2.node);         }
            |
            GT          t2 = factor {    $node = new MayorQue($node, $t2.node);     }
            |
            LT          t2 = factor {    $node = new MenorQue($node, $t2.node);     }
            |
            AND         t2 = factor {    $node = new And($node, $t2.node);          }
            |
            OR          t2 = factor {    $node = new Or($node, $t2.node);           }
            |
            //Gramatica para implementar el >=
            GEQ         t2 = factor {    $node = new MayorIgualQue($node, $t2.node);}
            |
            //Gramatica para implementar el <=
            LEQ         t2 = factor {    $node = new MenorIgualQue($node, $t2.node);}
            |
            //Gramatica para implementar el ==
            EQ          t2 = factor {    $node = new Igual($node, $t2.node);        }
    )*
    |
    //Gramatica para implementar el Not: el falso de una expresión
    NOT factor { $node = new Not($factor.node); }

;


factor returns [ASTNode node]: t1 = term {  $node = $t1._term;  }
            (
                MULTI  t2 = term {  $node = new Multiplication($node, $t2._term);   }
                |
                DIVI   t2 = term {  $node = new Divi($node, $t2._term);             }
            )* ;



term returns [ASTNode _term]:    NUMBER                 {   $_term = new Constant(Integer.parseInt($NUMBER.text));  }
                               | ID                     {   $_term = new VarRef($ID.text);  }
                               | CADE                   {   $_term = new Constant($CADE.text);  }
                               | BOOLEAN                {   $_term = new Constant(Boolean.parseBoolean($BOOLEAN.text)); }
                               |
                                 PAR_OPEN
                                            expression    {   $_term = $expression.node;  }
                                 PAR_CLOSE
                               |
                                 COMILLAS
                                            expression    {   $_term = $expression.node;  }
                                 COMILLAS
                               ;


PROGRAM : 'program' ;
VAR: 'var' ;
PRINTLN: 'println' ;
IF: 'if' ;
ELSE: 'else' ;


WHILE: 'while' ;

//Expresiones añadidas por el alumno
SQUARE: 'square' ;
POW:   'pow' ;
DO:    'do' ;
COMA: ',' ;

PLUS:  '+' ;
MINUS: '-' ;
MULTI: '*' ;
DIVI:  '/' ;

AND: '&&' ;
OR:  '||' ;
NOT: '!'  ;

GT:  '>'  ;
LT:  '<'  ;
GEQ: '>=' ;
LEQ: '<=' ;
EQ:  '==' ;
NEQ: '!=' ;

ASSING: '=' ;

BRACKET_OPEN:  '{' ;
BRACKET_CLOSE: '}' ;



PAR_OPEN:  '(' ;
PAR_CLOSE: ')' ;

SEMICOLON: ';' ;
BOOLEAN: 'true' | 'false'  ;

COMILLAS: '"'   ;

ID: [a-zA-Z][a-zA-Z0-9]* ;
CADE: COMILLAS [a-zA-Z][a-zA-Z0-9]* COMILLAS;
NUMBER: [0-9]+ ;

WS : [\t\n\r] + -> skip ;
