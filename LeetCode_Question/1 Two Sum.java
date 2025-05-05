package LeetCode_Question;

import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        // Sample input
        int[] nums = {3, 7, 11, 2};
        int target = 9;

        // Get the result
        int[] result = obj.twoSum(nums, target);

        // Print the result
        System.out.println("Index of Array is : " + Arrays.toString(result));  // Output: [0, 1]
    }

    // Method to find indices of two numbers that sum up to the target
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;              // Get the length of the array
        int[] ans = new int[2];           // Array to store the result indices

        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            // Loop through elements after the current element
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;           // Store index i
                    ans[1] = j;           // Store index j
                    return ans;           // Return the result immediately after finding the pair
                }
            }
        }

        return ans; // This won't happen as per problem statement
    }

}
