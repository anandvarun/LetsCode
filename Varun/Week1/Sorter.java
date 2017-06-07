import java.util.*;
class Sort{
  public String Sorter(String content){
    char[] output=content.toCharArray();
    Arrays.sort(output);
    return new String(output); //Converts to string and send back the character array.
    }
  public boolean checker(String input1,String input2){
  return Sorter(input1).equals(Sorter(input2));

  }
  public static void main(String args[]){
  Sort answer=new Sort();
  if(answer.checker("varun","vaun")){
  System.out.println("Got my answer");
    }
    else
    System.out.println("Nope");
  }
}
