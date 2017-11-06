import java.util.Arrays;

public class ArraysLab {
  
  public static int[] sum (int[] arr1, int[] arr2) {
    int[] arr3 = new int[arr1.length];
    for (int i = 0; i < arr3.length; i++){
        arr3[i] = arr1[i] + arr2[i];
    }
    return arr3;
  }
  
  public static int[] append(int[] arr, int num){
    int[] arr2 = new int[arr.length + 1];
    for (int i = 0; i < arr.legnth; i++){
      arr2[i] = arr[i];
    }
    arr[arr.length + 1] = num;
    return arr2;
  }
  
  public static int[] remove(int[] arr, int idx){
    int[] arr2 = new int[arr.length-1];
    for (int i = 0; i < idx; i++){
      arr2[i] = arr[i];
    }
    for (int k = idx; i < arr2.length, i++){
      arr2[k] = arr[k+1];
    }
    return arr2;
  }
  
  public static int sumEven(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i+= 2){
      sum += arr[i];
    }
    return sum;
  }
  
  public static void rotateRight(int[] arr){
    int last = arr[arr.length-1];
    for (int i = arr.length-1; i >= 1; i--){
      arr[i] = arr[i-1];
    }
    arr[0] = last;
    System.out.println("Array rotated to the right: " + Arrays.toString(arr));
  }
  
  public static void main (String[] args){
    int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
    int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
    int[] sumArr = sum(a1, a2);
    System.out.println("sumArr:" + Arrays.toString(sumArr));
    int appendNum= 200;
    int[] appendArr = append(a1, appendNum);
    System.out.println("appendArr:" + Arrays.toString(appendArr));
    int removeIdx = 5;
    int[] removeArr = remove(a2, removeIdx);
    System.out.println("removeArr:" + Arrays.toString(removeArr));
    int sumOfEvens = sumEven(appendArr);
    System.out.println("sumOfEvens:" + sumOfEvens);
    rotateRight(a1);
    System.out.println("a1:" + Arrays.toString(a1));
  }
}
    
    
    
 
    
