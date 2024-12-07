package BasicUnderstanding;

public class Main {
    public static void printLengthSUm (int [] arr, int n) {
        int z = arr.length;

        for (int i = 0; i <= z-n ; i++) {
            int sum  = 0;
            for (int j = i; j < i + n; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printLengthSUm(arr, 1);
    }
}
