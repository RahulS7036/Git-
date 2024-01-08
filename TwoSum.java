import java.util.Arrays;

class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        
        String str = Arrays.toString(twoSum(nums, target));
     
        System.out.print(str);

        
        
    }

    static int[] twoSum(int nums[],int target){
        int numLength = nums.length;
        int[] ans = new int[2];
        for(int i=0;i<numLength;i++){
            for(int j=i+1;j<numLength;j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;

                }
            }
        }

        return ans;

    }
}