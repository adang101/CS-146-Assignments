import java.util.ArrayList;
import java.util.List;

public class PA4 {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println(
                "Usage: java PA4 <question> where question can be 4.1, 4.2. 4.3 or 4.4");
            System.exit(-1);
        }
        if ("4.1".equals(args[0])) { // Longest common subsequence
            List<Integer> X = new ArrayList<>();
            Utils.readInts(X);
            List<Integer> Y = new ArrayList<>();
            Utils.readInts(Y);
            List<Integer> result = new ArrayList<>();
            //TODO: find the Longest common subsequence

            Utils.printInts(result);
        }
        if ("4.2".equals(args[0])) { // Longest increasing subsequence
            List<Integer> X = new ArrayList<>();;
            Utils.readInts(X);
            List<Integer> result = new ArrayList<>();
            //TODO: find the Longest increasing subsequence

            Utils.printInts(result);
        }
        if ("4.3".equals(args[0])) { // Currency problem
            List<Integer> denominations = new ArrayList<>();;
            Utils.readInts(denominations);
            List<Integer> amounts = new ArrayList<>();
            Utils.readInts(amounts);
            Integer targetAmount = amounts.get(0);
            //TODO: find the smallest number of coins
        }
        if ("4.4".equals(args[0])) { // Maximum rewards
            List<Integer> rewards = new ArrayList<>();;
            Utils.readInts(rewards);
            
            //TODO: find the maximum rewards 
        }


    }
}
