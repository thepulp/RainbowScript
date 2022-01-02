import java.util.Map;

public class Not implements ASTNode {
    private ASTNode operand1;


    public Not(ASTNode op1)
    {
        operand1 = op1;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        return !((boolean) operand1.execute(sTable));
    }
}
