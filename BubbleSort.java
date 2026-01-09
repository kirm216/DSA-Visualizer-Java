public class BubbleSort {

    public static void visualize(int[] arr) {
        System.out.println("\n--- Bubble Sort Visualization ---");

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("Comparing " + arr[j] + " and " + arr[j + 1]);

                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swap → " + arr[j] + " > " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    System.out.println("No Swap");
                }

                Utils.printArray(arr);
            }
        }

        System.out.println("\nSorted Array (Bubble Sort):");
        Utils.printArray(arr);
    }
}
