import java.util.*;
class MinimalTree extends BinaryTree{

  public BinaryTree createBinary(int[] arr,int start,int end){
      if(start>end){
      return null;
      }
      int mid=(start+end)/2;
      BinaryTree value=new BinaryTree(mid);
      value.left=createBinary(arr,start,mid-1);
      value.right=createBinary(arr,mid+1,end);
      return value;
    }
    public static void main(String args[]){
    int[] input={1,2,3,4,5,6,7,8,9,10};
    MinimalTree answer=new MinimalTree();
    BinaryTree soln = answer.createBinary(input,0,9);
    soln.inOrder(soln);
    }
}
