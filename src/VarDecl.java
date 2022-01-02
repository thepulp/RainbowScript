import java.util.Map;

public class VarDecl implements ASTNode {

    private String name;

    public VarDecl(String n)
    {
        name = n;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {
        sTable.put(name, new Object());
        return null;
    }
}
