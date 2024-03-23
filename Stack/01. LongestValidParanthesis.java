import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Initialize stack with -1 to handle the case where the first character is ')'
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                stack.push(i);
            } else {  // ch == ')'
                stack.pop();
                if (stack.isEmpty()) {  // Stack is empty
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        String input = scanner.nextLine();
        
        // Find the length of the longest valid parentheses substring
        int result = longestValidParentheses(input);
        System.out.println(result);
        
        scanner.close();
    }
}
