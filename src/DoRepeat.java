import java.util.List;
import java.util.Map;

public class DoRepeat implements ASTNode {

    private ASTNode condition;
    private List<ASTNode> body;

    public DoRepeat(ASTNode c, List<ASTNode> b)
    {
        condition = c;
        body = b;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        for(ASTNode n: body)
            n.execute(sTable);

        if((boolean) condition.execute(sTable))
        {
            for(ASTNode n: body)
                n.execute(sTable);

            if((boolean) condition.execute(sTable))
                this.execute(sTable);
        }

        return null;
    }
}
