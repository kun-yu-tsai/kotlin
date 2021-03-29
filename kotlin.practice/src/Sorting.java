import java.util.Arrays;
import java.util.Random;

public class Sorting{
    private static int size = 1000;
    private static int max = 10000;

    public static void main(String[] args){
        if(args.length >= 2) {
            size = Integer.valueOf(args[0]);
            max = Integer.valueOf(args[1]);
        }

        runSorting();
    }

    public static void runSorting(){
        Random r = new Random();
        int[] array = r.ints(size, 0, max).toArray();
        int[] array2 = array.clone();
        int[] array3 = array.clone();
        int[] array4 = array.clone();
        int[] array5 = array.clone();

        long startTime = System.nanoTime();
        selectionSort(array);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;

//        System.out.println(Arrays.toString(array));
        System.out.println(totalTime + " ns");

        //
        startTime = System.nanoTime();
        insertionSort(array2);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;

//        System.out.println(Arrays.toString(array2));
        System.out.println(totalTime + " ns");

        //
        startTime = System.nanoTime();
        bubbleSort(array3);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;

//        System.out.println(Arrays.toString(array3));
        System.out.println(totalTime + " ns");

        startTime = System.nanoTime();
        array4 = mergeSort(array4);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;

//        System.out.println(Arrays.toString(array4));
        System.out.println(totalTime + " ns");

        startTime = System.nanoTime();
        quickSort3(array5, 0, array.length - 1);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;

        System.out.println(Arrays.toString(array5));
        System.out.println(totalTime + " ns");
    }


    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = (i+1); j < array.length ; j++ ){
                if( array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                swap(array, minIndex, i);
            }
        }

    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSort3(int[] array, int low, int high){
        if( low >= high)
            return;

        int pivot = array[high];

        int lowerBound = low;
        for(int i = low; i < high ; i++ ){
            if(pivot > array[i]){
                swap(array, lowerBound, i);
                lowerBound++;
            }
        }

        swap(array, lowerBound, high);

        quickSort3(array, low, lowerBound - 1);
        quickSort3(array, lowerBound +1 , high);
    }

    // this is very slow becuz we need to
    // 1. keep swaping
    // 2. traverse all the elements. No terminating condition like insertion sort.
    public static void bubbleSort(int[] array){
        int index = 0;
        int boundary = array.length;
        while(boundary > 1){
            for(int i = 0 ; i < boundary -1 ; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
            boundary--;
        }

    }

    public static void insertionSort(int[] array){
        for(int index = 0; index < array.length - 1; index++){
            int i = index;
            while( i >=0 && array[i+ 1] < array[i]){ // in insertion sort, we have a terminating condition. Which kind of make it faster.
                swap(array, i, i+1);
                i--;
            }
        }
    }

    public static int[] mergeSort(int[] array){
        int[] mergedArray;
        if( array.length > 1){
            // First, I need to split the array.
            int mid = array.length / 2;
            int[] part1 = new int[mid];
            int[] part2 = new int[array.length - mid];

            for(int i = 0 ; i < array.length; i++){
                if(i < mid){
                    part1[i] = array[i];
                }
                else{
                    part2[i - mid] = array[i];
                }
            }

//            System.out.println(Arrays.toString(part1));
//            System.out.println(Arrays.toString(part2));

            // The arrays which are splitted.
            part1 = mergeSort(part1);
            part2 = mergeSort(part2);

            mergedArray = mergeArray(part1, part2);
            return mergedArray;
        }
        else{
            return array;
        }
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while ( i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else{
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        while( i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while( j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

    public static void printArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}