import java.util.ArrayList;
import java.util.Random;

public class Arrow {

    ArrayList<String> arrowVerbs = new ArrayList<String>();

    // Constructor
    public Arrow () {
        arrowVerbs.add("pierce");
        arrowVerbs.add("strike");
        arrowVerbs.add("stuck into");
        arrowVerbs.add("penetrate");
    }

    public void setArrowVerb (String str) {
        arrowVerbs.add(str);
    }

    public int getArrowVerbLen () {
        return arrowVerbs.size();
    }

    public String getArrowVerb () {
        Random rand =  new Random();
        int num = rand.nextInt(arrowVerbs.size());

        return arrowVerbs.get(num);
    }
}