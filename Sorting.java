import java.util.Arrays;
import java.util.Random;
public class Sorting{
   public static int[] swop(int[] list, int a1, int a2){
      int temp = list[a1];
      list[a1] = list[a2];
      list[a2] = temp;
      return list;
   }
   public static int[] Sort1(int[] list){
      for (int j = 0; j < list.length; j++){
         for (int i = 0; i < list.length-1; i++){
            if (list[i] > list[i+1]){
               //System.out.println(i);
               swop(list, i, i+1);
            }
         }
      }
      
      return list;
   }
   public static void main(String[] args){
      Random r = new Random();
      int length = 1000;
      int[] arr = new int[length];
      for (int i = 0; i < arr.length; i++){
         arr[i] = r.nextInt(length+1);
      }
      
      System.out.println(Arrays.toString(Sort1(arr)));
   }
}