package Activities;

import java.security.Key;
import java.util.Arrays;


public class Activity4 {
    public static void main(String[] args){
        int[] unsortedArr = {3,5,4,1,2,10,8,11};

        System.out.println("This is an unsorted array: ");
        System.out.println(Arrays.toString(unsortedArr));

        for (int i=0; i<unsortedArr.length; i++){
            int key = unsortedArr[i];
            int j = i-1;
            while (j>=0 && key< unsortedArr[j]){
                unsortedArr[j+1] = unsortedArr[j];
                --j;
            }

            unsortedArr[j+1]= key;


        }
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(unsortedArr));

    }
}
