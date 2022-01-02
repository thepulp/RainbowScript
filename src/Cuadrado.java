import java.util.Map;

public class Cuadrado implements  ASTNode{

    private ASTNode operand1;


    public Cuadrado(ASTNode op1)
    {
        operand1 = op1;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        System.out.println((int) operand1.execute(sTable) * (int) operand1.execute(sTable));
        return null;
    }
}
