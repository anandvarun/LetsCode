import java.util.*;
class URL{
  public StringBuffer SpaceReplacer(StringBuffer input,int length){
      StringBuffer output=new StringBuffer();
      String space=" ";
      for(int i=0;i<length;i++){
        if(input.charAt(i) == space.charAt(0)){
        output=output.append("%20");
        }
        else{
        output=output.append(input.charAt(i));
        }
      }
      return output;
  }
  public static void main(String args[]){
     URL answer=new URL();
     StringBuffer input=new StringBuffer("My name is varun");
     System.out.println(answer.SpaceReplacer(input , 16));
  }
}
