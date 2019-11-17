import java.util.Arrays;

public class HeapSort {
    //升序建大堆
    public void creatHeap (int[] arr ) {
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(arr, arr.length, i);
        }
    }
    public void shiftDown (int[] arr, int size, int index) {
        int parent = index;
        int child = 2 * index + 1;
        while (child < size) {
            if (child + 1 < size) {
                if (arr[child] < arr[child + 1]) {
                    child++;
                }
            }
            if (arr[child] <= arr[parent]) {
                break;
            }
            int temp = arr[child];
            arr[child] = arr[parent];
            arr[parent] = temp;
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public void heapSort(int[] arr) {
        creatHeap(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[0];
            arr[0] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            shiftDown(arr, arr.length - i - 1, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,5,2,7,3,6,8,1,4};
        HeapSort hp = new HeapSort();
        hp.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
