import java.util.ArrayList;
import java.util.List;

public class Dice {

    public static void main(String[] args) {
        int targetSum = 4;
        int numFaces = 3;
        
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(combinations, new ArrayList<>(), targetSum, numFaces);
        
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    private static void generateCombinations(List<List<Integer>> result, List<Integer> current, int remainingSum, int numFaces) {
        if (remainingSum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        if (remainingSum < 0) {
            return;
        }
        
        for (int i = 1; i <= numFaces; i++) {
            current.add(i);
            generateCombinations(result, current, remainingSum - i, numFaces);
            current.remove(current.size() - 1);
        }
    }
}

