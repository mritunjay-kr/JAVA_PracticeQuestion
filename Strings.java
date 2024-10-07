import java.util.*;
public class Strings{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Shree");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'G');
        System.out.println(sb);


        //Insert
        //StringBuilder sb = new StringBuilder("Shree");
        //System.out.print(sb);
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete
        sb.delete(1, 2);
        System.out.println(sb);

        //append
        sb.append(" N");
sb.append("a");
sb.append("n");
sb.append("d");
sb.append("a");
sb.append("n");
sb.append("i");

System.out.println(sb +" " + sb.length());

//reverse
for(int i=0; i<sb.length()/2; i++){
    int front =i;
    int back=sb.length()-1-i;

    char frontChar=sb.charAt(front);
    char backChar=sb.charAt(back);

    sb.setCharAt(front, backChar);
    sb.setCharAt(back, frontChar);
}
System.out.println(sb);

    }
}