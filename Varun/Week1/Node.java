import java.util.*;
class Node{
  Node next;
  int data;

  public static void add(Node input,Node linker){

    input.next=linker;
  
  }
  public static void print(Node head){
    while(head != null){
      System.out.println(head.data);
      head=head.next;
    }
  }
}
