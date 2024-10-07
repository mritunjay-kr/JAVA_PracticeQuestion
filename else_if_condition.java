import java.util.*;
public class else_if_condition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter a=");
        int a = sc.nextInt();

        System.out.print("Enter b=");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        } else if (a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lasser");
        }*/

        int button = sc.nextInt();

        if (button == 1){
            System.out.println("Hello");
        } else if(button == 2){
            System.out.println("Namaste");
        } else if (button == 3){
            System.out.print("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }

    }
    
}


