import java.util.*;
public class BubbleSortADA{  
      public static void main(String[] args) {  
                Scanner sc = new Scanner(System.in);
                Random r = new Random();
                //System.out.print("Enter the size of array :");
                int size = 100000;
                int arr[] =new int[size];
                for(int i = 0; i<10; i++){
                  arr[i] = r.nextInt(100000);
                } 
                // System.out.println("Array Before Sorting");  
//                 for(int i=0; i < arr.length; i++){  
//                   System.out.print(arr[i] + " ");  
//                 }  
                System.out.print("\n");   
                bubble_Sort(arr);  
                System.out.println("Array After Sorting");  
                for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
                }  
   
        } 
        static void bubble_Sort(int[] arr) {  
          int len = arr.length;  
          int temp = 0;  
          for(int i=0; i < len; i++){  
             for(int j=1; j < (len-i); j++){  
                if(arr[j-1] > arr[j]){  
                 temp = arr[j-1];  
                 arr[j-1] = arr[j];  
                 arr[j] = temp;  
                }  
                           
             }  
          }  
  
       }
         
}  