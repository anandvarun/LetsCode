


import java.util.*;
import java.io.*;
class Max_Sub_Array_Sum
{


  public static void main(String[] args)
  {
    int[] arr = {-2,3,2,-1};
   Max_Sub_Array_Sum sb = new Max_Sub_Array_Sum();
   sb.find_max_sum(arr,0,arr.length-1);
  }

public static void find_max_sum(int[] arr,int start, int end)
{
  int current = arr[0];
  int global = arr[0];
 //int s_max = 0;
 for(int i = 1;i< arr.length;i++)
 {



  current = find_max(arr[i],current+arr[i]);
  //current = s_max;
  global = find_max(current, global);
 }
 System.out.println("Mx sum is"+ global);
 }

public static int find_max(int a,int b)
{
  int max_value;
 if(a > b)
 {
   max_value =a;
 }
 else
 {
   max_value = b;
 }
 return max_value;
}
}
