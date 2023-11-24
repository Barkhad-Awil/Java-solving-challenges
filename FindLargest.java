/* 
    Exercise 1.0 Write a method called indexOfMax that takes an array of
    integers and returns the index of the largest element. Can you write this
    method by using an enhanced for loop? Why or why not?
*/

public class FindLargest{
    
    public static int indexOfMax(int[] arr){
        if(arr.length == 0 ){       
            return -1;
        }

        int maxNumber = arr[0];
        int index = 0;
        int i = 1;
        
        while (i < arr.length){
            if(arr[i] > maxNumber){
                maxNumber = arr[i];
                index = i;
            }
            i++;
        }
        System.out.println("Max number and Index are: " + maxNumber + "and " + index);
        
        return index;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,5,6,2};
        int resultIndex = indexOfMax(array);
       
        if(resultIndex >= 0){
            System.out.println("Index of of the largest element is " + resultIndex);
        } else {
            System.out.println("Array is empty");
        }
       
    }
    
}


