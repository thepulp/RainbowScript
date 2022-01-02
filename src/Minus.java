import java.util.Map;

public class Minus implements ASTNode {

private ASTNode operand1;
private ASTNode operand2;

public Minus(ASTNode op1, ASTNode op2)
        {
        operand1 = op1;
        operand2 = op2;

        }

@Override
public Object execute(Map<String, Object> sTable) {

        return (int) operand1.execute(sTable) - (int) operand2.execute(sTable);
        }
        }
