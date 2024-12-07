package Easy;

public class MaxAvarage {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        for (int i = k ; i< nums.length; i++) {
            sum -= nums[i- k];
            sum += nums[i];

            double avg = sum / k;

            if (maxAvg < avg) {
                maxAvg = avg;
            }
        }

        return maxAvg;
    }
    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(arr, k));
    }
}
