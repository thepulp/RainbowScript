import java.util.Map;

public class Println implements ASTNode {

    private ASTNode data;

    public Println(ASTNode d)
    {
        data = d;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        System.out.println(data.execute(sTable));

        return null;
    }
}
