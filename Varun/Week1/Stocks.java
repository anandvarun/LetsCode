import java.util.*;
class Stock{
  public int maxProfit(int arr[]){
    int minValue=a[0];
    int maxProfit=0;
    for(int i=1;i<arr.length();i++){
      if(a[i]-minValue > maxProfit){
        maxProfit=a[i]-minValue;
      }
      if(a[i] < minValue){
        minValue=a[i];
      }
    }
  }
}
