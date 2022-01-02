import java.util.Map;

public class VarAssing implements ASTNode {

    private String name;
    private ASTNode expression;

    public VarAssing(String n, ASTNode exp)
    {
        super();
        name = n;
        expression = exp;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {
        sTable.put(name, expression.execute(sTable));
        return null;
    }
}
