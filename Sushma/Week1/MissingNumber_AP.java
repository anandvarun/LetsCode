import java.io.*;
//import java.util.*;
//import java.math.*;
public class MissingNumber_AP
{
    public static void main(String[] args)
    {
    //Scanner sc = new Scanner(System.in);
    //sc.nextInt();
      int ap1[] = {1,19,28,37};
      int missing_number=0;
    //int ap2[] = {1,10,19,28};
    //int ap3[] = {10,19,28,37};
      missing_number = get_missing_element(ap1);
      System.out.println(missing_number);


    }
    public static int get_missing_element(int array[])
    {
      int i = 0;
      int n =  array.length; // .length attribute for integer,double arrays
      int sum_array_elements = 0;
      int sum_ap = 0;
      sum_ap = ( ((n+1) * (array[0] + array[n-1])) /2);
      for( i=0 ; i<n ; i++)
      {
        sum_array_elements+=array[i];
      }
      return (sum_ap - sum_array_elements);
   }
}
