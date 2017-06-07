import java.util.*;
class BitInsertion{
  long merger(long n,long m,long i,long j){
      long mShifted=m << i;
      System.out.println(mShifted);
      n= n | mShifted;
      return n;
  }



  public static void main(String args[]){
    BitInsertion answer=new BitInsertion();
    System.out.println(answer.merger2(1000000000,10011,6,2));
    System.out.println(answer.merger(1000000000,10011,6,2));
  }
}
