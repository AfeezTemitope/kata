import java.util.Arrays;
public class SwapOddIndices {


    public static void swapOddIndices(int[] arr) {
        for (int j = 1; j < arr.length; j += 2) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};

        swapOddIndices(myArray);


        System.out.println(Arrays.toString(myArray));
    }
}
