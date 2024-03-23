import java.util.*;

class Main {
    public static void main(String args[]) {
        //Try out your code here
        //Valid Order: ^,*/,+-.
        //Bracket chalu hone pe sirf bracket ke andr ki precedence dekhni hai
        //Bracket bnd hote hi saare pop krdo, opening bracket tk.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> S = new Stack<>();
        int i = 0;
        
        while (i < s.length()) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.print(s.charAt(i));
                i++;
            } else if (s.charAt(i) == '(') {
                S.push(s.charAt(i));
                i++;
            } else if (s.charAt(i) == ')') {
                while (!S.isEmpty() && S.peek() != '(') {
                    System.out.print(S.pop());
                }
                if (!S.isEmpty()) {
                    S.pop();  // Pop the '('
                }
                i++;
            } else {
                if (s.charAt(i) == '^') {
                    S.push(s.charAt(i));
                } else if (s.charAt(i) == '/' || s.charAt(i) == '*') {
                    while (!S.isEmpty() && (S.peek() == '^' || S.peek() == '/' || S.peek() == '*')) {
                        System.out.print(S.pop());
                    }
                    S.push(s.charAt(i));
                } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    while (!S.isEmpty() && (S.peek() == '^' || S.peek() == '*' || S.peek() == '/' || S.peek() == '+' || S.peek() == '-')) {
                        System.out.print(S.pop());
                    }
                    S.push(s.charAt(i));
                }
                i++;
            }
        }
        
        while (!S.isEmpty()) {
            System.out.print(S.pop());
        }
    }
}
