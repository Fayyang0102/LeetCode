/**
 * Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


 * Created by qihuiyang on 7/16/17.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle){
        if(needle.length() == 0){
            return 0;
        }
        for(int i = 0 ; i < haystack.length() - needle.length(); i ++){
            for(int j = 0; j <= needle.length() && haystack.charAt(i+j) == needle.charAt(j); j++){
                if(j == needle.length() -1){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        ImplementStrStr implementStrStr = new ImplementStrStr();
        String S = "abcdefg";
        String N = "bc";
        int res = implementStrStr.strStr(S,N);
        System.out.print(res);
    }
}
