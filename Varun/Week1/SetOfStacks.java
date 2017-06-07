import java.util.*;
class SetOfStacks{
  ArrayList<Stack> stack=new ArrayList<Stack>();
    public void Stackpush(int input){
    Stack last=getLastStack();
    int capacity=2;
      if(last.size() ==2) {

      Stack newStack=new Stack(capacity);
      newStack.push(input);
      stack.add(newStack);
      }
      else{
      last.push(input);
      }
    }
    public int StackPop(){
      Stack<Integer> last=getLastStack();
      int output=last.pop();
      if(last.isEmpty()){
        stack.remove(stack.size()-1);

      }
      return output;
    }
    public int popAt(int position){
      Stack present=stack.get(position);
      int output=(int)present.pop();
      return output;
    }
    public Stack getLastStack(){

    return stack.get(stack.size()-1);
    }
    public static void main(String args[]){
    SetOfStacks answer=new SetOfStacks();
    answer.Stackpush(5);
    answer.Stackpush(6);
    answer.Stackpush(7);
    answer.Stackpush(3);
    answer.Stackpush(8);
    System.out.println(answer.StackPop());
    }
}
