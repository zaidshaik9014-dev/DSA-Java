public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums){

        int left=0;
        int right=nums.length-1;

        int[] ans=new int[nums.length];

        int index=nums.length-1;

        while(left<=right){

            if(Math.abs(nums[left])>Math.abs(nums[right])){

                ans[index]=nums[left]*nums[left];
                left++;

            }else{

                ans[index]=nums[right]*nums[right];
                right--;
            }

            index--;
        }

        return ans;
    }

    public static void main(String[] args){

        int[] nums={-4,-1,0,3,10};

        int[] ans=sortedSquares(nums);

        for(int x:ans)
            System.out.print(x+" ");
    }
}