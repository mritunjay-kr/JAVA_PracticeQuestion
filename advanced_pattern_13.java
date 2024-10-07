//import java.util.*;
//(i)Butterfly pattern
public class advanced_pattern_13 {
    public static void main(String args[]){
        /*int n=5;
        for(int i=1; i<=n; i++){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int space= 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1; i--){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int space= 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//(ii)Solid rohmbus
/*int n=5;
for(int i=1; i<=n; i++){
    //space
    for(int j=1; j<=n-i;j++){
        System.out.print(" ");
    }
    //star
    for (int j=1; j<=n; j++){
        System.out.print("* ");
    }
    System.out.println();
}*/

//(iii)Number pyramid
/*int n=5;
for(int i=1; i<=n; i++){
    //space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //number
    for(int j=1; j<=i; j++){
        System.out.print(i+" ");
    }
    System.out.println();
}*/

//palandromic pattern
/*int n=5;
for (int i=1; i<=n; i++){
    //space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //1st half
    for(int j=i; j>=1; j--){
    System.out.print(j);
    }
    //2nd half
    for(int j=2; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}*/

//Diamond pattern
int n=4;
for(int i=1; i<=n; i++){
    //space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
//lower half
for(int i=n; i>=1; i--){
    //space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
