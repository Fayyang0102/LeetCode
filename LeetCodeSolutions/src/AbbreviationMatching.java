import static java.lang.Character.isDigit;

/**
 * Created by qihuiyang on 8/9/17.
 */
public class AbbreviationMatching {
    public static boolean abbreMatching(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }
        if (s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        if (isDigit(s2.charAt(0))) {
            int i = 0;
            int num = 0;
            while (i < s2.length() && isDigit(s2.charAt(i))) {
                num = num * 10 + s2.charAt(i) - '0';
                i++;
            }
            if (num > s1.length()) {
                return false;
            } else {
                return abbreMatching(s1.substring(num), s2.substring(i));
            }
        } else {
            if (s1.charAt(0) != s2.charAt(0)) {
                return false;
            } else {
                return abbreMatching(s1.substring(1), s2.substring(1));
            }

        }

    }
    public static void main(String[] args){
        String s1 = "abbbbbbbbbbc";
        String s2 ="a11c";
        AbbreviationMatching abbreviationMatching = new AbbreviationMatching();
        boolean res = abbreviationMatching.abbreMatching(s1,s2);
        System.out.print(res);
    }

}
