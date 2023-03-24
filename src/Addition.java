import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Addition {

    public void addPolynomials(List<Integer> Term) {
    Integer sum=0;
    for(int i=  Term.size()-1; i>=0; i--){
        sum=sum+Term.get(i);
        }

    System.out.println(sum);

    }
}
