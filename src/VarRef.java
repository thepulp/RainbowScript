import java.util.Map;

public class VarRef implements ASTNode {

    private String name;

    public VarRef (String n) {

        name = n;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        return sTable.get(name);
    }
}