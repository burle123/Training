package Arrays;
import java.util.*;

public class DisariumNum{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int orgNum = num;
        int digitCount = 0;
        
        while (num != 0) {
            num /= 10;
            digitCount++;
        }
        
        num = orgNum;
        int sum = 0;
        
        while (num != 0) {
            int d = num % 10;
            sum += Math.pow(d, digitCount);
            digitCount--;
            num /= 10;
        }
        
        if (sum == orgNum)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
}