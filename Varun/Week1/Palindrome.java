import java.util.*;
class Palindrome{
  private boolean palin(String input){
    int value;
    int[] set=new int[128];
      for(int i=0;i<input.length();i++){
      value=input.charAt(i);
      set[value]=set[value]+1;
      }
      if(oddChecker(set)){
      return true;
      }
      return false;
  }
  private static boolean oddChecker(int[] input){
    int oddCounter=0;
      for(int i=0;i<128;i++){
        System.out.println(input[i]);
        if(input[i]%2 != 0){
          oddCounter=oddCounter+1;
          }
    }
    if(oddCounter > 1)
      return false;

    return true;

  }
  public static void main(String args[]){
  Palindrome answer=new Palindrome();
    if(answer.palin("VaV")){
    System.out.println("It is a palindrome");
    }
    else
    System.out.println("Nope");
  }

}
