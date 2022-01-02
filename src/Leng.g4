grammar Leng;

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
//Declaracion de sentencias java, Árbol de Nodos
sentence returns [ASTNode node]:
            var_decl
                {   $node = $var_decl.node;  }
            |
            var_assing
                {   $node = $var_assing.node;  }
            |
            println
                { $node = $println.node; }
            | conditional
                { $node = $conditional.node; }
            ;

//Codigo Java, declarar y almacenar una variable en el programa
var_decl returns [ASTNode node]: VAR ID SEMICOLON
    {
        $node = new VarDecl($ID.text);
        //sTable.put($ID.text, 0);
        //System.out.println("Declarando variable: " + $ID.text);
    }
;
//Asignacion de valor a una variable
var_assing returns [ASTNode node]: ID ASSING expression SEMICOLON
    {
        $node = new VarAssing($ID.text, $expression.node);
        //sTable.put($ID.text, $expression.node);
        //System.out.println("Asignacion de variable: " + $ID.text + " = " + $expression.node);
    }
;

//Imprimir valor
println returns [ASTNode node]: PRINTLN expression SEMICOLON
    {
        //System.out.println("PRINTLN expression value: " + $expression.node);
        $node = new Println($expression.node);
    }
;

/* este if no funciona if((8+3)>22) */
conditional returns [ASTNode node]: IF PAR_OPEN expression+ PAR_CLOSE
                {
                    List<ASTNode> body = new ArrayList<ASTNode>();
                    List<ASTNode> bodyElse = new ArrayList<ASTNode>();
                    $node = new If($expression.node, body, bodyElse);
                }
                BRACKET_OPEN ( s1 = sentence { body.add($s1.node); })  BRACKET_CLOSE
             ELSE
                BRACKET_OPEN ( s2 = sentence { bodyElse.add($s2.node); })  BRACKET_CLOSE

                {
                    /*
                    if((boolean) $expression.node)
                    {

                    }
                    else
                    {

                    }
                    */

                    //$node = new If($expression.node, body, bodyElse);

                }
;

/*
expression returns [Object value]:
    NUMBER { / * Java code * /
    $value = Integer.parseInt($NUMBER.text); }
    |
    ID { //Java Code
            $value = sTable.get($ID.text);
       };

       */


expression returns [ASTNode node]: t1 = factor {    $node = $t1.node;
                                                    //$node = (int) $t1.node;
}
    (       PLUS      t2 = factor {     $node = new Addition($node, $t2.node);     }
            |
            MINUS      t2 = factor {
                                                    $node = new Minus($node, $t2.node);
                                                    //System.out.println("suma value: " + $t1.node + " - " + $t2.node);
                                                    //$node = (int) node - (int) $t2.node;
                                   }

    )* ;


factor returns [ASTNode node]: t1 = term {  $node = $t1._term;
                                            //$node = (int) $t1._term;
                                         }
            (
                    MULTI  t2 = term {
                                        $node = new Multiplication($node, $t2._term);  }
                |
                     DIVI  t2 = term {
                                        $node = new Divi($node, $t2._term);   }
            )* ;



term returns [ASTNode _term]:    NUMBER
                                    {
                                        $_term = new Constant(Integer.parseInt($NUMBER.text));
                                        //$_term = Integer.parseInt($NUMBER.text);
                                    }
                               |   ID
                                    {
                                        $_term = new VarRef($ID.text);
                                        //$_term = sTable.get($ID.text);
                                    }
                               | BOOLEAN
                                    {
                                        $_term = new Constant(Boolean.parseBoolean($BOOLEAN.text));
                                        //$_term = Boolean.parseBoolean($BOOLEAN.text);
                                    }
                               | PAR_OPEN expression {
                                                            $_term = $expression.node;
                                                            //$_term = $expression.node;
                                                      }
                                 PAR_CLOSE ;




PROGRAM : 'program' ;
VAR: 'var' ;
PRINTLN: 'println' ;
IF: 'if' ;
ELSE: 'else' ;

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

ID: [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+ ;

WS : [\t\n\r] + -> skip;
