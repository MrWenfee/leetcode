// 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
// 输入: nums = [1,3,5,6], target = 5
// 输出: 2
// 
//
// 示例 2: 
//
// 
// 输入: nums = [1,3,5,6], target = 2
// 输出: 1
// 
//
// 示例 3: 
//
// 
// 输入: nums = [1,3,5,6], target = 7
// 输出: 4
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 为 无重复元素 的 升序 排列数组 
// -10⁴ <= target <= 10⁴ 
// 
//
// Related Topics 数组 二分查找 👍 1838 👎 0


package leetcode.editor.cn;

/**
 * 搜索插入位置
 *
 * @author Wenfee
 * @date 2023-01-05 17:37:12
 */
public class P35_SearchInsertPosition {
    public static void main(String[] args) {
        // 测试代码
        Solution solution = new P35_SearchInsertPosition().new Solution();
    }

    // leetcode
// leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = ((right - left) >> 1) + left;
                // int mid = ((right - left) / 2) + left;
                // 保证 左边的值一直小于 target
                if (target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
// leetcode submit region end(Prohibit modification and deletion)

}
