package Stack;

class ImplementationOfStackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.peek();
        // stack.pop();
        // stack.peek();
        // System.out.println("Is stack empty ?:" + stack.isEmpty());
        stack.pop();
    }

    static class Stack {
        int top;
        int[] arr;

        public Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        public void push(int data) {
            if (top == arr.length - 1) {
                throw new StackOverflowError("Stack is full");
            }
            top++;
            arr[top] = data;
        }

        public void pop() {
            if (top == -1) {
                throw new RuntimeException("Stack is empty");
            }
            System.out.println("Popped element is: " + arr[top]);
            top--;
        }

        public void peek() {
            if (top == -1) {
                throw new RuntimeException("Stack is empty");
            }
            System.out.println("Top element is: " + arr[top]);
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

}
