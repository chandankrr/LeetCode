import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(]";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;

                char popChar = st.pop();
                if (c == ')' && popChar != '(')
                    return false;

                if (c == '}' && popChar != '{')
                    return false;

                if (c == ']' && popChar != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }
}
