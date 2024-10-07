//for loop
import java.util.*;
public class do_while_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = sc.nextInt();

        /*int sum=0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);*/

        for(int i=1; i<11; i++){
            System.out.println(i*n);
        }
    }
}
