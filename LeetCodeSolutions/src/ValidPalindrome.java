/**
 * Created by qihuiyang on 7/8/17.
 */
public class ValidPalindrome {
    public boolean isPalindrom(String s){
        if(s.isEmpty()){ return true;}
        int left = 0, right = s.length() -1;
        char leftChar, rightChar;
        while(left <= right){
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);
            if(! Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if (!Character.isLetterOrDigit(rightChar)){
                right --;
            }
            else{
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                else{
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "I love u u evol I";
        ValidPalindrome palindrome = new ValidPalindrome();
        boolean res = palindrome.isPalindrom(str);
        System.out.print(res);


    }

}
