public class TrappingRainWater {
    public static int trap(int[] height) {
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int leftMax = 0, rightMax = 0;

            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            water += Math.min(leftMax, rightMax) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {

        int[] height = {4,2,0,3,2,5};

        System.out.println(trap(height));
    }
}