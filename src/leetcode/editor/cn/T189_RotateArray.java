// 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
//
// 
//
// 示例 1: 
//
// 
// 输入: nums = [1,2,3,4,5,6,7], k = 3
// 输出: [5,6,7,1,2,3,4]
// 解释:
// 向右轮转 1 步: [7,1,2,3,4,5,6]
// 向右轮转 2 步: [6,7,1,2,3,4,5]
// 向右轮转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 
// 输入：nums = [-1,-100,3,99], k = 2
// 输出：[3,99,-1,-100]
// 解释:
// 向右轮转 1 步: [99,-1,-100,3]
// 向右轮转 2 步: [3,99,-1,-100]
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 0 <= k <= 10⁵ 
// 
//
// 
//
// 进阶： 
//
// 
// 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。 
// 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？ 
// 
//
// 
// 
//
// 
// 
//
// Related Topics 数组 数学 双指针 👍 1682 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 轮转数组
 *
 * @author Wenfee
 * @date 2023-01-06 23:17:01
 */
public class P189_RotateArray {
    public static void main(String[] args) {
        // 测试代码
        Solution solution = new P189_RotateArray().new Solution();
    }

    // leetcode
// leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            // k = 13, 那么以七个为一个数组，最后需要 6 个
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        /**
         * 指定数组下标进行翻转
         *
         * @param nums  需要操作的数组
         * @param start 起始下标
         * @param end   结束下标
         */
        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
// leetcode submit region end(Prohibit modification and deletion)

}
