import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    
    public static List<String> generateSubsequences(String s) {
        List<String> subsequences = new ArrayList<>();
        int n = s.length();
        
        // Total number of subsequences will be 2^n
        int totalSubsequences = 1 << n; // equivalent to 2^n
        
        // Generate all subsequences
        for (int i = 1; i < totalSubsequences; i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                // Check if j-th bit in i is set
                if ((i & (1 << j)) != 0) {
                    subsequence.append(s.charAt(j));
                }
            }
            subsequences.add(subsequence.toString());
        }
        
        return subsequences;
    }
    
    public static void main(String[] args) {
        String s = "abc";
        List<String> subsequences = generateSubsequences(s);
        System.out.println(subsequences);
    }
}
