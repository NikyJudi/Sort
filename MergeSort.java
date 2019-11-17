import java.util.Arrays;

public class MergeSort {
    public static void mergeSort (int[] arr) {
        mergeSort(arr, 0, arr.length);
    }
    public static void mergeSort (int[] arr, int left, int right) {
        if (left >= right || right - left == 1) {
            return;
        }
        int mid = (right - left) / 2 + left;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid, right);
        merge(arr, left, mid, right);
    }
    public static void merge (int[] arr, int left, int mid, int right) {
        int length = right - left;
        int[] output = new int[length];
        int outputIndex = 0;
        int i = left;
        int j = mid;
        while (i < mid && j < right) {
            if (arr[i] <= arr[j]) {
                output[outputIndex++] = arr[i++];
            } else {
                output[outputIndex++] = arr[j++];
            }
        }
        while (i < mid) {
            output[outputIndex++] = arr[i++];
        }
        while (j < right) {
            output[outputIndex++] = arr[j++];
        }
        for (int k = 0; k < length; k++) {
            arr[left + k] = output[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,2,7,3,6,8,1,4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
