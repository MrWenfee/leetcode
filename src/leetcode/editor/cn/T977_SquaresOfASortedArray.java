// 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [-4,-1,0,3,10]
// 输出：[0,1,9,16,100]
// 解释：平方后，数组变为 [16,1,0,9,100]
// 排序后，数组变为 [0,1,9,16,100]
//
// 示例 2： 
//
// 
// 输入：nums = [-7,-3,2,3,11]
// 输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
//
// Related Topics 数组 双指针 排序 👍 691 👎 0


package leetcode.editor.cn;

/**
 * 有序数组的平方
 *
 * @author Wenfee
 * @date 2023-01-06 19:12:29
 */
public class P977_SquaresOfASortedArray {
    public static void main(String[] args) {
        // 测试代码
        Solution solution = new P977_SquaresOfASortedArray().new Solution();
    }

    // leetcode
// leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];
            // nums 升序的数组
            int negative = -1;
            // 找到负数的分界点
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    negative = i;
                } else {
                    break;
                }
            }

            int index = 0;
            // i 负数最大的下标
            int i = negative;
            // j 正数的最小下标
            int j = negative + 1;
            while (i >= 0 || j < nums.length) {
                if (i < 0) {
                    // 数组不存在负数
                    result[index] = nums[j] * nums[j];
                    j++;
                } else if (j == nums.length) {
                    // 数组全是负数
                    result[index] = nums[i] * nums[i];
                    i--;
                } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                    /**
                     * 最小正数平方 大于 最大负数平方情况
                     * 当前循环取 最大负数下标的平方
                     *
                     * -2, -1, 2, 3
                     *
                     * i = 1; j = 2
                     *
                     * -1平方 小于 2平方
                     * result[index] = 下标为 1 的平方
                     */
                    result[index] = nums[i] * nums[i];
                    i--;
                } else {
                    /**
                     * 最小正数 小于等于 最大负数平方情况
                     * 当前循环需要取 正整数下标的平方
                     *
                     * 【-3, -2, 1, 2】
                     * i = 1; j = 2
                     *
                     * -2平方 大于 1平方
                     * result[index] = 下标为 2 的平方
                     */
                    result[index] = nums[j] * nums[j];
                    j++;
                }
                index++;
            }

            return result;
        }
    }
// leetcode submit region end(Prohibit modification and deletion)

}
