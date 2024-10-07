import java.util.*;
public class Greater_Smaller_06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }else{
            if(a>b){
                System.out.println("a is greater");
            }else{
                System.out.println("a is lesser");
            }
        }
    }
    
}
