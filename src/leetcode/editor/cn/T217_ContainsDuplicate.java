//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,1]
//输出：true 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：false 
//
// 示例 3： 
//
// 
//输入：nums = [1,1,1,3,3,4,3,2,4,2]
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// Related Topics 数组 哈希表 排序 👍 886 👎 0


package leetcode.editor.cn;

import java.util.HashSet;

/**
 * 存在重复元素
 * @author Wenfee
 * @date 2023-01-06 23:51:22
 */
public class P217_ContainsDuplicate{
	 public static void main(String[] args) {
	 	 // 测试代码
	 	 Solution solution = new P217_ContainsDuplicate().new Solution();
	 }
	 
// leetcode
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>(nums.length);
		for (int v : nums) {
			// add 添加重复元素会返回 false， 取反， 进行结束程序
			if (!set.add(v)) {
				return true;
			}
		}
		return false;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
