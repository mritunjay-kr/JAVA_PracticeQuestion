import java.util .*;
//package javaTpoint.Array;
//import java.util.*;
//import java.util.Arrays;
/*public class Array {
    public static void main(String args[]){
       // int[] arr ={5,6,7,8,9};
       // System.out.println(arr.length);

       int[] ages = new int[3];
       float[] weights = new float[3];
       String[] names ={"rahul", "raj", "aradhya", "MJ"};

       ages[0]=34;
       ages[1]=12;
       ages[2]=45;
       for(int i=0; i<3; i++){
        System.out.println( ages[i]);
       }
    }
}*/

/*public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*public class Array{
    public static void main(String args[]){
        int originalArray[];
        int cloneArray[];
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        size = sc.nextInt();

        originalArray = new int[size];
        cloneArray = new int[size];
        System.out.println("Enter elements of original array:");
        for(int i=0; i<size; i++){
        originalArray[i] = sc.nextInt();
        }
        sc.close();
        cloneArray = Arrays.copyOfRange(originalArray, 2, 4);
        System.out.println("Elements of original array:");
        for(int i=0; i<originalArray.length; i++){
            System.out.print(originalArray[i]+" ");
        }
        System.out.println("\n\nElements of the clone array:");
        for(int i=0; i<cloneArray.length; i++){
            System.out.print(cloneArray[i]+ " ");
        }
    }
}*/


/*public class Array{
    public static int countOccurances(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Count of x:" + countOccurances(arr, x));
    }
}*/

/*public class Array{
    public static int lastOccurance(int[] arr, int x){
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array:");
            int n=sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter x: ");
            int x = sc.nextInt();
            System.out.println("Last Occurance: " + lastOccurance(arr,x));
        
    }
}*/

/*public class Array{
    public static int greaterNum(int[] arr, int x){
        int greater = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                greater++;
            }
        }
        return greater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n+ " element");
        for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
        }

        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Greater then x: "+greaterNum(arr,x));
    }
}*/

public class Array{
    public static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n+ " element");
        for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Is sorted:"+isSorted(arr));
}
}