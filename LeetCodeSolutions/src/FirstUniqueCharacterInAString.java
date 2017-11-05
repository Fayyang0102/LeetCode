import java.util.HashMap;

/**
 * Created by qihuiyang on 7/24/17.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] alf = new int[26];
        char[] arr = s.toCharArray();
        //iterate the whole char array
        for (char c : arr) {
            alf[c - 'a']++;
        }

        // return index at which the char only appear once
        for (int i = 0; i < arr.length; i++) {
            if (alf[arr[i] -'a'] == 1) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String str = "helloworld";
        FirstUniqueCharacterInAString fc = new FirstUniqueCharacterInAString();
        int res = fc.firstUniqChar(str);
        System.out.print(res);
    }

}
