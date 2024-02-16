import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a non-negative integer (n) to calculate Fibonacci: ");
        int n = scanner.nextInt();
        Solution solution= new Solution();
        System.out.println("Fibonacci("+n+")="+solution.fibonacci(n));



    }
}

class Solution {


    // HashMap used to memorize Fibonacci numbers
    private Map<Integer,Integer> memo= new HashMap<>();
    public int fibonacci(int n){
        if (n<0){
            System.err.println("Error: Fibonacci sequence is not defined for negative values.");
        }


        if (n==0 || n==1){
            return n;
        }

        /* If the calculated Fibonacci numbers exist in memory,
         return them from memory without recalculating them*/
        if(memo.containsKey(n)){
            return memo.get(n);
        }else{

            int result =fibonacci(n-1)+fibonacci(n-2);
            // Store the calculated value
            memo.put(n,result);
            return result;

        }
    }
}