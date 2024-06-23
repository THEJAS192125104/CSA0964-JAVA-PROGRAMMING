import java.util.Arrays;
import java.util.Scanner;
class Prog {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println(Arrays.toString(arr));

    }

}