import java.util.Arrays;

public class delNumberArrya {
    private int[] arr;

    public delNumberArrya(int[] arr) {
        this.arr = arr;
    }

    public int[] removeElement(int number){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) count++;
            else arr[i - count] = arr[i];
        }
        return Arrays.copyOf(arr, arr.length - count);
    }
}
