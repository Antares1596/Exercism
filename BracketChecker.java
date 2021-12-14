import java.util.Stack;

public class BracketChecker {
    private char[] chararr;
    Stack<Character> stack = new Stack<>();
    private boolean status = true;
    public BracketChecker(String data){

        chararr = data.toCharArray();
        // System.out.println(stack);
    }
    boolean areBracketsMatchedAndNestedCorrectly() {
        char temp;

        for (Character c : chararr) {
            if (c == '(' || c == '[' || c == '{')
            {
                stack.push(c);
                continue;
            }


            if (stack.isEmpty())
                return false;
            switch (c){
                case ')':
                    temp = stack.pop();
                    if (temp == '[' || temp == '{')
                        return false;
                    break;
                case '}':
                    temp = stack.pop();
                    if (temp == '[' || temp == '(')
                        return false;
                    break;
                case ']':
                    temp = stack.pop();
                    if (temp == '{' || temp == '(')
                        return false;
                    break;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "{}[]";
        BracketChecker bracketChecker = new BracketChecker(s);
        System.out.println(bracketChecker.areBracketsMatchedAndNestedCorrectly());

    }
}
