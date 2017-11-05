/**
 * Created by qihuiyang on 7/23/17.
 */
public class LongestCommonPrefix {
    public String longestPrefix(String[] strs){
        if(strs.length == 0 ){
            return "";
        }
        String pre = strs[0];
        for(int i = 1; i < strs.length;i++){
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length() -1);

            }
        }
        return pre;
    }
    public static void main(String[] args){
        String[] str = {"abc","ab","abcde","abcdefg"};
        LongestCommonPrefix common = new LongestCommonPrefix();
        String res = common.longestPrefix(str);
        System.out.print(res);
    }

}
