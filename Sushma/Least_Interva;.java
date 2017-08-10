public class Least_Interval
{
 pulic static void find_least_interval(char[] arr, int n)
 {

  boolean[25] char_arr = new boolean();
  int char_input;
  for(int i = 0; i < arr.length; i++)
  {
    char_input = arr[i];

    if(char_arr[char_input % 65] == True)
    {

    least_intervals += n;

     }
     else
     {
       char_arr[char_input % 65] == True;
     }
}
public static void main(String[] args)

{
    char[] arr  = {'A','A','A','B','B','B'};
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Least_Interval ar = new Least_Interval();
    ar.find_least_interval(n,arr);
}
