import java.util.*;
class StackMin{
  Stack<Integer> s=new Stack<Integer>();
  Stack<Integer> minTracker=new Stack<Integer>();
    public void Stackpush(int input){
    s.push(input);
      if(minTracker.isEmpty()){
        minTracker.push(s.peek());
        }
      else{
        if(input<=minTracker.peek()){
          minTracker.push(input);
        }
    }

  }
  public int StackPop(){
    if(s.peek() == minTracker.peek()){
      minTracker.pop();
    }

  return s.pop();
  }
    public int minValue(){
    return minTracker.peek();
    }
  public static void main(String args[]){
  StackMin answer=new StackMin();
  answer.Stackpush(5);
  answer.Stackpush(6);
  answer.Stackpush(7);
  answer.Stackpush(3);
  answer.Stackpush(8);
  System.out.println(answer.StackPop());
  System.out.println(answer.minValue());
  }

}
