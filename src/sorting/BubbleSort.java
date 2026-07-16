package sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 7, 8, 4, 6};
        int n = arr.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!swap){
                break;
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}
