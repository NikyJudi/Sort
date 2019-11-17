import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int l = low;
        int r = high;
        int key = arr[l];
        while(l != r) {
            while (l != r && key <= arr[r]) {
                r--;
            }
            arr[l] = arr[r];
            while (l != r && key >= arr[l]) {
                l++;
            }
            arr[r] = arr[l];
            arr[l] = key;
         }
        quickSort(arr, low, l - 1);
        quickSort(arr, l + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,2,7,3,6,8,1,4};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
