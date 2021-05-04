import java.util.*;
class dijkstra{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[][] = new int[][]{{999,3,999,999,5},{999,999,8,5,3},{999,999,999,999,999},{999,999,2,999,999},{999,999,999,4,999}};
     // arr[0][0]= 999;
      //System.out.print(Arrays.deepToString(arr));
      System.out.print(arr[0][0]);
     // arr[0][0] =999;arr[0][1] =3;arr[0][2] =999;arr[0][3] =999;arr[0][4] =5;arr[0][0] =999;arr[0][0] =999;arr[0][0] =999;
     
      
      int dij[][] = new int[5][5];
      arr[][]={{999,3,999,999,5},{999,999,8,5,3},{999,999,999,999,999},{999,999,2,999,999},{999,999,999,4,999}};
      dij[0][0] = 0;
      dij[0][1] = 1000;
      dij[0][2] = 1000;
      dij[0][3] = 1000;
      dij[0][4] = 1000;
      String al[] = new String[]{"a","b","c","d","e"};
      System.out.print(" "+al[0]);
      int[] min_index = new int[2];
      //min_index = min(arr[0][0]);
     //  for(int i=0; i<5;i++){
//          if(
//       }
      int count = 0;
      while(count==5){
         for(int i=0; i<5;i++){
            if(arr[0][i]==999){
               count= count+1;
            }
         }
         if(count!=5){
            
         }
      }
     
      
   }
   public static int[] min(int[] arr){
      int len = arr.length;
      int index =0;
      int temp[] = new int[len];
      for(int i =0; i<len; i++){
         temp[i] = arr[i];
      }
      int min= arr[index];
      for(int i = 0; i<len; i++){
         if(arr[i]<min && min!=999){
            min=arr[i];
            index= i;
         }
         else{
            min = 999;
            index=-1;
         }
      }
      int r[] = new int[2];
      r[0] = min;
      r[1] = index;
      arr[index]=999;
      return r;
   }
}