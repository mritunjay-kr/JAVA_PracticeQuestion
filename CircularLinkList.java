import java.util.Scanner;

class Node
{
		int info;
		Node link;
}

class CircularLinkedList
{
	Node head;
    Node tail;
	Scanner sc=new Scanner(System.in);
	
	public void create()
	{
		//Adding first Node
		Node temp=new Node();
		System.out.println("Input info: ");
		temp.info=sc.nextInt();
		temp.link=null;
		head=temp;
		
		//Adding remaining nodes
		Node newNode;
		System.out.println("Do you want to add more Nodes(1/0): ");
		int ch=sc.nextInt();
		
		while(ch==1)
		{
			newNode=new Node();
			System.out.println("Input info: ");
			newNode.info=sc.nextInt();
			newNode.link=null;
			temp.link=newNode;
			temp=newNode;
			System.out.println("Do you want to add more Nodes(1/0): ");
			ch=sc.nextInt();
		}
	}
	
	public void display()
	{
		Node temp=head;
        if(temp==null)
        System.out.println("The circular linked list");
        else
        {
            System.out.println("The circular linked list");
            System.out.println("head="+head);
            do
        {
            System.out.println(temp.info+" "+ temp.link);
            //System.out.println(temp.info);
            temp = temp.link;
        }while(temp!=tail.link);
		
		}
    }
}

class SinglyLinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next=null;
        }
    }
    
    static Node addEmpty(Node last,int data){
        if(last!=null){
            return last;
        }
        Node newNode = new Node(data);
        last=newNode;
        newNode.next=last;
        return last;
    }
    
    static Node addFront(Node last,int data){
        if(last==null){
            return addEmpty(last,data);
        }
        Node newNode = new Node(data);
        newNode.next=last.next;
        last.next=newNode;
        return last;
    }
    
    static Node addEnd(Node last,int data){
        if(last==null){
            return addEmpty(last,data);
        }
        Node newNode = new Node(data);
        newNode.next=last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }
    
    static void traversal(Node last){
        Node p;
        if(last==null){
            System.out.print("empty");
            return;
        }
        p=last.next;
        do{
            System.out.print(p.data+" ");
            p=p.next;
        }while(p!=last.next);
        
    }
    public static void main(String[] args){
        Node last = null;
    last = addEmpty(last, 6);
     last = addFront(last, 2);
      last = addEnd(last, 8);
      last = addFront(last, 12);
    traversal(last);
    }
    
}