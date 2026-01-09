public class SelectionSort {

    public static void visualize(int[] arr) {
        System.out.println("\n--- Selection Sort Visualization ---");

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("\nSelecting minimum for position " + i);

            for (int j = i + 1; j < n; j++) {
                System.out.println("Compare " + arr[j] + " with current min " + arr[minIndex]);

                if (arr[j] < arr[minIndex]) {
                    System.out.println("New minimum found → " + arr[j]);
                    minIndex = j;
                }
            }

            System.out.println("Swapping " + arr[i] + " and " + arr[minIndex]);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            Utils.printArray(arr);
        }

        System.out.println("\nSorted Array (Selection Sort):");
        Utils.printArray(arr);
    }
}
