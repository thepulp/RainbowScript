import java.util.List;
import java.util.Map;

public class If implements ASTNode {

    private ASTNode condition;
    public List<ASTNode> body;
    public List<ASTNode> elseBody;


    public If(ASTNode c, List<ASTNode> b, List<ASTNode> eb)
    {
        condition = c;
        body = b;
        elseBody = eb;
    }

    @Override
    public Object execute(Map<String, Object> sTable) {

        if((boolean) condition.execute(sTable))
             {
                for(ASTNode n: body)
                    n.execute(sTable);
             }
        else {
                if(elseBody.size() > 0)
                    for(ASTNode n: elseBody)
                        n.execute(sTable);
            }

        return null;
    }
}
