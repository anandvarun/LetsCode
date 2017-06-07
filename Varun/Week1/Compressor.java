import java.util.*;
class Compressor{
  public String compress(String input){
  int count=1;
  String output=new String();
    for(int i=0;i<input.length();i++){
      if(i==input.length()-1){
          output=output+input.charAt(i)+new Integer(count).toString();
      }
      else
        if(input.charAt(i) == input.charAt(i+1)){
        count++;
        }
        else{
        output=output+input.charAt(i)+new Integer(count).toString();
        count=1;
        }
    }
      if(output.length() < input.length()){
        return output;
    }
      return input;
  }
  public static void main(String args[]){
    Compressor answer=new Compressor();
    System.out.println(answer.compress("aaabbccc"));
  }
}
