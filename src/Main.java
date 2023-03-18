/*
Question : Java Program to Find the Sum of the Series 1/1!+1/2!+1/3!+…1/N!
_____________________________________________________________________________
Case 1 (Simple Test Case):

Enter the number of terms in the series
34
The sum is 1.7182818284590455
 */
import java.util.Scanner;
public class Main {
    double factorial(double temp){
        double sum = 1;
        while (temp > 0){
            sum *= temp;
            temp--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = 1,temp2 = 1,digit,sum = 0;
        Main obj = new Main();
        System.out.println("Enter the digit for finding series value :");
        digit = sc.nextDouble();
        System.out.println("Printing the result :");
        while (temp2 <= digit){
            sum += temp / obj.factorial(temp2);
            temp2++;
        }
        System.out.println(sum);
    }
}