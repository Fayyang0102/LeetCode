import java.util.HashSet;

/**
 * Created by qihuiyang on 4/1/17.
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s == null || s.length() == 0 ){
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int count = 0 ;
        for (int i = 0 ; i < s.length(); i ++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()){
            return count*2+1;
        }
        else{
            return count*2;
        }

    }

    public static void main(String[] args){
        String s = "abccccdd";
        int res = longestPalindrome(s);
        System.out.print("longest palidrome is : " + res);
    }
}
