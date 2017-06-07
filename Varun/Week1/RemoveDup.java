import java.util.*;
class RemoveDup extends Node{

    public void method1(Node head){
      HashSet<Integer> set= new HashSet<Integer>();
      Node previous=new Node();
      previous=head;
      while(head != null){
        if(set.contains(head.data)){
          previous.next=head.next;
          }
        else{
          set.add(head.data);
          previous=head;

        }
        head=head.next;
    }

    }
    public void method2(Node head){
      Node temp=new Node();
      temp=head;
      while(head !=null){
        while(temp.next !=null){
          if(head.data == temp.next.data){
            temp.next=temp.next.next;
          }
          else{
            temp=temp.next;
          }
        }
      head=head.next;
      }
    }

    public static void main(String args[]){
      Node head= new Node();
      head.data=5;
      Node two=new Node();
      two.data=5;
      Node three=new Node();
      three.data=5;
      Node.add(head,two);
      Node.add(two,three);
      RemoveDup answer=new RemoveDup();
      answer.method2(head);
      head.print(head);
  }
}
