import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class Btree{
    Node root;
    public void insert(Scanner sc){
        System.out.print("Enter the root node: ");
        int data = sc.nextInt();
        root=new Node(data);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.print("Do you want to enter the left of :" + node.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the value "+node.data);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.print("Do you want to enter right of"+ node.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the value of the right of"+node.data);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Btree tree=new Btree();
        tree.insert(sc);

        
    }
    
}
