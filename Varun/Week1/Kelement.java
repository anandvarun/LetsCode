import java.util.*;
class Kelement{

  public void Finder(Node head,int k){
    Kelement countChecker=new Kelement();
    int count=countChecker.counter(head);
    int position=count-k;
    for(int i=0;i<position;i++){
    head=head.next;
    }
    System.out.println(head.data);
  }
  public int counter(Node head){
  int count=0;
    while(head !=null){
      count++;
      head=head.next;
    }
  return count;
  }

  public static void main(String args[]){
    Node head= new Node();
    head.data=5;
    Node two=new Node();
    two.data=6;
    Node three=new Node();
    three.data=7;
    Node.add(head,two);
    Node.add(two,three);
    Kelement answer=new Kelement();
    answer.Finder(head,3);

  }
}
