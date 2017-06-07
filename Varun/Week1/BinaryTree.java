import java.util.*;
public class BinaryTree{
BinaryTree left;
BinaryTree right;
int data;
  BinaryTree(){
    this.data=0;
    this.left=null;
    this.right=null;
  }
  BinaryTree(int root){
    this.data=root;
    this.left=null;
    this.right=null;
  }
  void inOrder(BinaryTree input){
        if(input != null){
          inOrder(input.left);
          System.out.println(input.data);
          inOrder(input.right);
          }
  }
  void postOrder(BinaryTree input){
      if(input !=null){
        System.out.println(input.data);
        preOrder(input.left);
        preOrder(input.right);
      }

  }
  void preOrder(BinaryTree input){
    if(input !=null){
      System.out.println(input.data);
      preOrder(input.left);
      preOrder(input.right);
      }
    }
  void addIntoTree(BinaryTree root,BinaryTree leftTree, BinaryTree rightTree){
    root.left=leftTree;
    root.right=rightTree;
  }
  public static void main(String args[]){
    BinaryTree input1=new BinaryTree(5);
    BinaryTree input2=new BinaryTree(6);
    BinaryTree input3=new BinaryTree(7);
    input1.addIntoTree(input1,input2,input3);
    input1.postOrder(input1);
  }
}
