import java.util.*;
import java.io.*;
public class Rotate_Matrix
{

public static void main(String[] args)

{
  //int[][] a = {{1,2,3,4} ,{5,6,7,8} ,{9,10,11,12} ,{13,14,15,16}};
  int[][] a = {{1,2},{3,4}};
  int len = a.length;
  Rotate_Matrix rt = new Rotate_Matrix();
  rt.rotate_matrix(a);
}
public void rotate_matrix(int[][] a)
{

 int len = a.length;
 int[][] b = new int[len][len];
 //int k=0;
//int n = length;
 for(int i = 0; i < len ; i++)
 {
   for(int k = 0; k < len; k++)
   {

    b[i][k] = a[len-1-k][i];

  }
 }
 for(int i = 0; i < len ; i++)
 {
   for(int k = 0; k < len; k++)
   {

    System.out.print(b[i][k]+"\t");

  }
  System.out.println(" ");

 }

 }
 }
