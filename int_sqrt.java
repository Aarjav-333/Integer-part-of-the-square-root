import java.util.*;

public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        int guess = x;
        
        while (true) {
            int newGuess = (guess + x / guess) / 2;
            if (newGuess >= guess) {
                return guess;
            }
            guess = newGuess;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to find its Square Root");
        num = sc.nextInt();
        System.out.println(mySqrt(num)); 
        sc.close(); 
        }
}
