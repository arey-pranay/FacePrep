import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int result = 0;
        int sign = 1; // 1 represents positive sign, -1 represents negative sign

        StringTokenizer tokenizer = new StringTokenizer(s, "+-()", true);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();

            if (token.isEmpty()) {
                continue;
            }

            char c = token.charAt(0);

            if (Character.isDigit(c)) {
                num = Integer.parseInt(token);
            } else if (c == '+' || c == '-') {
                result += sign * num;
                num = 0;
                sign = c == '+' ? 1 : -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // pop sign
                result += stack.pop(); // pop result inside parentheses
            }
        }

        result += sign * num; // Add the last number
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Solution solution = new Solution();
        int result = solution.calculate(expression);

        System.out.println(result);
    }
}
