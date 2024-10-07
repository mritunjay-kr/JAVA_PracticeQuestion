import java.util.Scanner ;
public class question_03{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("The sum of a and b is: ");
        int sum = a+b;
        System.out.println(sum);
    }
}
