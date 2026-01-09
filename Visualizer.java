import java.util.Scanner;

public class Visualizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DSA Sorting Visualizer ===");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        switch (choice) {
            case 1:
                BubbleSort.visualize(arr);
                break;

            case 2:
                SelectionSort.visualize(arr);
                break;

            case 3:
                InsertionSort.visualize(arr);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
