import java.util.*;
import java.io.*;
public class Least_Interval
{
 public static void find_least_interval(char[] arr, int n)
 {

  Boolean[] char_arr = new Boolean[25];
  Arrays.fill(char_arr,Boolean.FALSE); //initialise a boolean array else throws
  //null pointer exception
  int char_input = 0;
  int least_intervals = 0;

  for(int i = 0; i < arr.length; i++)
  {
    char_input = arr[i];
    //System.out.println(char_input);
    //System.out.println(char_input % 65);
    if(char_arr[char_input % 65] == true)
    {

    least_intervals += n;

     }
     else
     {
       char_arr[char_input % 65] = true;
     }
}
System.out.println(least_intervals);
}
public static void main(String[] args)
{
    char[] arr  = "AAABBB".toCharArray();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Least_Interval ar = new Least_Interval();
    ar.find_least_interval(arr,n);
}
}
