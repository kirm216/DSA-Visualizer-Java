public class InsertionSort {

    public static void visualize(int[] arr) {
        System.out.println("\n--- Insertion Sort Visualization ---");

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("\nInserting " + key + " into sorted part of array");

            while (j >= 0 && arr[j] > key) {
                System.out.println("Move " + arr[j] + " to position " + (j + 1));
                arr[j + 1] = arr[j];
                Utils.printArray(arr);
                j--;
            }

            System.out.println("Place " + key + " at position " + (j + 1));
            arr[j + 1] = key;
            Utils.printArray(arr);
        }

        System.out.println("\nSorted Array (Insertion Sort):");
        Utils.printArray(arr);
    }
}
