
//Solid Square
public class Pattern_12 {
    public static void main(String args[]){
        /*int n=4;
        int m=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

    //Hollow rectangle
       /* int n=4;
        int m=5;

        for (int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if( i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }*/

    //Half pyramid
    /*int n=4;
    for (int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }*/

//Inverted half pyramid
/*int n=4;
for (int i=n; i>=1; i--){
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
      }*/

//180'' Inverted half pyramid
     /*int n=4;
     for(int i=1; i<=n; i++){
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     }*/

    //half pyramid with number
    /*int n=5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }*/

//Inverted half pyramid with number
/*int n=5;
for (int i=1; i<=n; i++){
    for(int j=1; j<=n-i+1; j++){
        System.out.print(j+" ");
    }
    System.out.println();
}*/

//Floyd's Triangle
/*int n=5;
int number = 1;
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        System.out.print(number+" ");
        number++;
    }
    System.out.println();
}*/

//0-1 Triangle
/*int n=5;
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        int sum =i+j;
        if(sum%2==0){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
    }
    System.out.println();
}*/



    }
}


