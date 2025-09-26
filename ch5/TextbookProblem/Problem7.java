import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        //System.out.println(Arrays.stream(array).max().getAsInt());
        int max = array[0];
        for (int candidate : array) {
            max = max>candidate?max:candidate;
        }
        System.out.println(max);
    }
}
