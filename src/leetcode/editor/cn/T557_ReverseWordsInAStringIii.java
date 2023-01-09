// 给定一个字符串
// s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例 1： 
//
// 
// 输入：s = "Let's take LeetCode contest"
// 输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 示例 2: 
//
// 
// 输入： s = "God Ding"
// 输出："doG gniD"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// 
// s 包含可打印的 ASCII 字符。 
// 
// s 不包含任何开头或结尾空格。 
// 
// s 里 至少 有一个词。 
// 
// s 中的所有单词都用一个空格隔开。 
// 
//
// Related Topics 双指针 字符串 👍 508 👎 0


package leetcode.editor.cn;

/**
 * 反转字符串中的单词 III
 *
 * @author Wenfee
 * @date 2023-01-08 22:12:16
 */
public class P557_ReverseWordsInAStringIii {
    public static void main(String[] args) {
        // 测试代码
        Solution solution = new P557_ReverseWordsInAStringIii().new Solution();
    }

    // leetcode
// leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            StringBuffer ret = new StringBuffer();
            int length = s.length();
            int i = 0;
            while (i < length) {
                int start = i;
                while (i < length && s.charAt(i) != ' ') {
                    i++;
                }
                for (int p = start; p < i; p++) {
                    ret.append(s.charAt(start + i - 1 - p));
                }
                while (i < length && s.charAt(i) == ' ') {
                    i++;
                    ret.append(' ');
                }
            }
            return ret.toString();
        }
    }
// leetcode submit region end(Prohibit modification and deletion)

}
