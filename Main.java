class Main {
  public static void main(String[] args) {
    /**
     * 
     * Given an integer array nums and an integer val, remove all occurrences of val
     * in nums in-place. The relative order of the elements may be changed.
     * 
     * Since it is impossible to change the length of the array in some languages,
     * you must instead have the result be placed in the first part of the array
     * nums. More formally, if there are k elements after removing the duplicates,
     * then the first k elements of nums should hold the final result. It does not
     * matter what you leave beyond the first k elements.
     * 
     * Return k after placing the final result in the first k slots of nums.
     * 
     * Do not allocate extra space for another array. You must do this by modifying
     * the input array in-place with O(1) extra memory.
     * 
     * Ex:
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements
     * of nums containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k (hence they are
     * underscores).
     * 
     **/

    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

    int val = 2;

    System.out.println(removeElement(nums, val));


    /**
      SOLUTION:
      - First create a variable for count, set to 0;
      - Create a for loop to iterate through nums.
      - Within the for loop, create an if statement where if nums[i] is not equal to val, then set the value at nums[count] to the value at nums[i];
      - Increment count.
      - Outside of the for loop and at the end of program, return count;


    **/
    
  }
  

  public static int removeElement(int[] nums, int val) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[count] = nums[i];
        count++;
      }

    }

    return count;

  }
}