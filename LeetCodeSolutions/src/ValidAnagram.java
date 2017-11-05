import java.util.HashMap;
import java.util.HashSet;

/**Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false

 * Created by qihuiyang on 7/26/17.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashSet<Character> container = new HashSet<>();
       // HashSet<Character> check = new HashSet<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0 ; i < sChar.length ; i++){
            container.add(sChar[i]);
        }
        for(int i = 0; i < sChar.length; i++){
            if(!container.contains(tChar[i])){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagramBEST(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
    public static void main(String[] args){
        String s = "abc";
        String t = "bc";
        ValidAnagram va = new ValidAnagram();
        boolean res = va.isAnagramBEST(s,t);
        System.out.print(res);


    }

}
