import java.util.Map;

public class Exponencial implements  ASTNode {

    private ASTNode operand1;
    private ASTNode operant2;

    public Exponencial(ASTNode op1, ASTNode op2 )
    {
        operand1 = op1;
        operant2 = op2;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {
        int base = (int) operand1.execute(sTable);
        int exponente = (int) operant2.execute(sTable);
        int resultado = 1;

        /*for (i=1; i<=exponente; i++){
            resultado = resultado * base;
        }*/
        while (exponente !=0){
            resultado *=base;
            --exponente;
        }

        System.out.println(resultado);
        return null;
    }
}
