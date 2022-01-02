import java.util.Map;

public class Constant implements ASTNode {

    private Object value;

    public Constant(Object v) {
        value = v;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {
        return value;
    }
}

