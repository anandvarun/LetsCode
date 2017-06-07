import java.util.*;
class Loop extends Node{

    public Node loopFinder(Node head){
      HashSet<Node> set= new HashSet<Node>();

      while(head != null){
        if(set.contains(head)){
          return head;
          }
        else{
          set.add(head);


          }
        head=head.next;
      }
    return null;
    }


    public static void main(String args[]){
      Node head= new Node();
      head.data=5;
      Node two=new Node();
      two.data=6;
      Node three=new Node();
      three.data=7;
      Node four=new Node();
      four.data=8;
      Node five=new Node();
      five.data=9;
      Node six=new Node();
      six.data=10;
      Node.add(head,two);
      Node.add(two,three);
      Node.add(three,four);
      Node.add(four,five);
      Node.add(five ,six);
      Node.add(six,two);

      Loop answer=new Loop();
      Node soln=answer.loopFinder(head);
      System.out.println(soln.data);
  }
}
