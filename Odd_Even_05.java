import java.util.Scanner;
public class Odd_Even_05 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
