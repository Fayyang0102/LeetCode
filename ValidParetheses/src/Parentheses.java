import java.util.Stack;

/**
 * Created by FAY on 1/31/17.
 */
public class Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}[[]"));
        System.out.println(isValid("{[}]"));
        System.out.println(isValid("[{}]"));
    }

    public static boolean isValid(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> set = new Stack();
        for (Character ch : arr) {
            if (ch == '{' || ch == '[' || ch == '(') {
                set.push(ch);
            } else if (ch == ']') {
                if (set.isEmpty() || set.peek() != '[') {
                    return false;
                }
                set.pop();
            } else if (ch == ')') {
                if (set.isEmpty() ||  set.peek() != '(')
                    return false;
                set.pop();
            } else if (ch == '}') {
                if (set.isEmpty() ||  set.peek() != '{')
                    return false;
                set.pop();
            }
        }
        return set.size() == 0;
    }
}
