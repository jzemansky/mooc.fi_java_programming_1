
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for(int num : array) {
            if(smallest > num) {
                smallest = num;
            }
        }      
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestIndex = smallest(array);
        int index = 0;
        
        for(int num : array) {
            if(smallestIndex == num) {
                break;
            } else {
                index++;
            }
            
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int index = startIndex;
        int smallest = table[index];
        
        for(int i = startIndex; i < table.length; i++) {
            if(table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));
        
        while(index < array.length) {
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            index++;
        }
    }
            
}
