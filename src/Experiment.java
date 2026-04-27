import java.util.Random;

public class Experiment {

    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000);
        }

        return arr;
    }

    public static void runExperiment(int size) {
        System.out.println("\nArray size: " + size);

        int[] arr1 = generateArray(size);
        int[] arr2 = arr1.clone();

        // Bubble Sort timing
        long start = System.nanoTime();
        Sorter.bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort time: " + (end - start) + " ns");

        // Merge Sort timing
        start = System.nanoTime();
        Sorter.mergeSort(arr2);
        end = System.nanoTime();
        System.out.println("Merge Sort time: " + (end - start) + " ns");

        // Binary Search (on sorted array)
        int target = arr2[size / 2];

        start = System.nanoTime();
        int index = Searcher.binarySearch(arr2, target);
        end = System.nanoTime();
        System.out.println("Binary Search time: " + (end - start) + " ns");

        System.out.println("Element found at index: " + index);
    }
}