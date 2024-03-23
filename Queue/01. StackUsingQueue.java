import java.util.*;

class MyStack {
    Queue<Integer> st = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();

    void push(int x) {
        while (!st.isEmpty()) {
            temp.add(st.remove());
        }
        st.add(x);
        while (!temp.isEmpty()) {
            st.add(temp.remove());
        }
    }

    int pop() {
        return st.remove();
    }

    int top() {
        return st.peek();
    }

    boolean empty() {
        return st.isEmpty();
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        ArrayList<Integer> A = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            int a = sc.nextInt();
            if (a == -1)
                flag = false;
            else
                A.add(a);
        }
        for (int i = 0; i < A.size(); i++) {
            int temp = A.get(i);
            if (temp == 1) {
                i++;
                stack.push(A.get(i));
            } else if (temp == 2) {
                if (!stack.empty())
                    System.out.println("Pop: " + stack.pop());
                else
                    System.out.println("Stack is empty."); // Added else statement for handling empty stack
            } else if (temp == 3) {
                if (!stack.empty())
                    System.out.println("Top element: " + stack.top());
                else
                    System.out.println("Stack is empty."); // Added else statement for handling empty stack
            } else if (temp == 4) { // Case for checking if the stack is empty
                System.out.println("Is empty: " + stack.empty());
            }
        }
    }
}
