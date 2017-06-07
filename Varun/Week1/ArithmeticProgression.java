//Given an arithmetic progression with one number missing find that missing number

import java.util.*;
class ArithmeticProgression{
  int missingNumberFinder(int input[]){
    int first=0;
    int last=input.length-1;

    int ap=(input[last]-input[first])/input.length; //Arithmetic progession
    System.out.println(ap);
      while(first<=last){
        int mid=(first+last)/2;
          if(input[mid]==input[0]+mid*ap){
            mid=mid+1;
        }
        else{
          if( (input[mid] != input[0]+ mid * ap ) && (input[mid-1] == (((mid-1)*ap )+input[0]))){
            System.out.println(mid);
            return (((mid )*ap) +input[0]);
        }
          else{
          last=mid-1;
          }
      }

    }
    return -1;
  }
    public static void main(String args[]){
      int input[] = {1,7,10,13,16,19,22};
      ArithmeticProgression answer=new ArithmeticProgression();
      System.out.println(answer.missingNumberFinder(input));
    }
}
