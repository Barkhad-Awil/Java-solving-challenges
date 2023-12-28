public class Demo {
    public static int[] leftRightDifference(int[] nums){
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            leftSum[i] = count;
            count += nums[i]; 
            int sum = 0;
            for(int j = i +1; j < nums.length; j++){
                sum += nums[j];
            }
            rightSum[i] = sum;
            ans[i]= Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }

    public static void main(String...args){
        int[] nums = {10, 4, 8, 3};
        int[] arr = leftRightDifference(nums);
        for(int n:arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
}
