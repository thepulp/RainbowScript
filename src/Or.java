import java.util.Map;

public class Or implements ASTNode {

    private ASTNode operand1;
    private ASTNode operand2;

    public Or (ASTNode op1, ASTNode op2)
    {
        operand1 = op1;
        operand2 = op2;

    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        return (boolean) operand1.execute(sTable) || (boolean) operand2.execute(sTable);
    }
}

