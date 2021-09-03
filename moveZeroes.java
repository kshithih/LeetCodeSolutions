import java.util.*;

public class moveZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] nums = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            nums[i] = scan.nextInt();
        }
        Solution283 s = new Solution283();
        s.moveZeroes(nums);
        for (int i = 0; i < number_of_elements; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}