import java.util.Arrays;
import java.util.Random;
public class Sorting{
   public static int[] swop(int[] list, int a1, int a2){ #this function swaps two elements in an array
      int temp = list[a1];
      list[a1] = list[a2];
      list[a2] = temp;
      return list;
   }
   public static int[] Sort1(int[] list){ # this is my first sorting algorithm. It has a time-complexity of O(n^2). It can be improved upon by checking if the list is sorted at *
      for (int j = 0; j < list.length; j++){
         for (int i = 0; i < list.length-1; i++){
            if (list[i] > list[i+1]){
               swop(list, i, i+1);
            }
          #*check if the list is sorted here to improve the best and average cases
         }
      }
      return list;
   }
   public static void main(String[] args){ # this is used to generate a random list for method to sort
      Random r = new Random(); 
      int length = 1000;
      int[] arr = new int[length];
      for (int i = 0; i < arr.length; i++){
         arr[i] = r.nextInt(length+1);
      }
      
      System.out.println(Arrays.toString(Sort1(arr)));
   }
}
