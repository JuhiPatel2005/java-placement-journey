import java.util.Arrays;

public class ShuffleArray {
  public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int index = 0;
       for(int i = 0; i < n; i++){
            ans[index] = nums[i];
            ans[index + 1] = nums[i+n];
            index+=2;
       }
       return ans;
    }

    public static void main(String args[]){
      int[] nums = {1,2,3,4,5,11,12,13,14,15};
      int n = nums.length/2;
      ShuffleArray ans = new ShuffleArray();
      int[] an = ans.shuffle(nums,n);
      System.out.println("shuffled array: "+ Arrays.toString(an));
    }
}
