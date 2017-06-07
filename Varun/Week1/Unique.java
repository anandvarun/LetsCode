import java.util.*;
class Unique{
  private boolean isUnique(String input){
    int value;
    boolean[] charSet=new boolean[128];
      for(int i=0;i<input.length();i++){
      value=input.charAt(i);
      if(charSet[value]){
      return false;
      }
      else{
      charSet[value] = true;
      }
    }
    return true;
  }
  public static void main(String args[]){
    Unique answer=new Unique();
      if(answer.isUnique("varuv")){
      System.out.println("is Unique");
      }
      else
      System.out.println("Not Unique");
  }
}
