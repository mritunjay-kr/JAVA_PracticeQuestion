import java.util.Scanner;
public class Condition_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");  
        int age = sc.nextInt();

        if (age>18){
            System.out.println("Adult");
        } else {
            System.out.println("No Adult");
        }
    }
    
}
