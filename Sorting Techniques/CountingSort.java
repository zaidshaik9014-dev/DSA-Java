public class CountingSort {

    public static void countingSort(int[] nums) {

        int max = nums[0];

        // Find maximum
        for (int num : nums) {
            if (num > max)
                max = num;
        }

        // Frequency array
        int[] count = new int[max + 1];

        // Count occurrences
        for (int num : nums) {
            count[num]++;
        }

        // Rewrite original array
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                nums[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,1,1,2,4,3,2,4,3};

        countingSort(nums);

        for (int num : nums)
            System.out.print(num + " ");
    }
}