import java.util.*;

class Main {
    public static void main(String args[]) {
        Stack<Integer> S = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of expressions directly
        sc.nextLine(); // Consume the newline character
        
        for (int j = 0; j < n; j++) {
            String s = sc.nextLine(); // Read the expression as a whole line
            int i = 0;
            while (i < s.length()) {
                char a = s.charAt(i);
                if (Character.isDigit(a)) {
                    S.push((int) (a - '0')); // Convert char to int
                    i++;
                } else {
                    int top = S.pop();
                    int st = S.pop();
                    switch (a) {
                        case '+':
                            S.push(st + top);
                            break;
                        case '-':
                            S.push(st - top);
                            break;
                        case '*':
                            S.push(st * top);
                            break;
                        case '/':
                            S.push(st / top);
                            break;
                        default:
                            System.out.println("Invalid Operation Found : " + a);
                    }
                    i++; // Increment i inside the switch case
                }
            }
            System.out.println(S.pop()); // Print the final result after evaluating the expression
        }
    }
}
