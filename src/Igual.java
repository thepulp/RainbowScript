import java.util.Map;

public class Igual implements ASTNode {
    private ASTNode operand1;
    private ASTNode operand2;

    public Igual (ASTNode op1, ASTNode op2)
    {
        operand1 = op1;
        operand2 = op2;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        boolean bande = (int) operand1.execute(sTable) == (int) operand2.execute(sTable);
        return bande;
    }
}
