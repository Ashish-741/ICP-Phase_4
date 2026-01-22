package Stack;
public class ImplementationOfStackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println("Peek: " + stack.peek()); // Output: 40
        
        // Pop elements
        System.out.println("Popped: " + stack.pop()); // Output: 40
        System.out.println("Popped: " + stack.pop()); // Output: 30
        
        System.out.println("Peek: " + stack.peek()); // Output: 20
    }
    
    static class Stack{
        Node top;
        
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        
        // Push element onto stack
        public void push(int data){
            Node newNode = new Node(data);
            if(top==null){
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }
        
        // Pop element from stack
        public int pop(){
            if(top == null){
                System.out.println("Stack is empty!");
                return -1;
            }
            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }
        
        // Peek at top element
        public int peek(){
            if(top == null){
                System.out.println("Stack is empty!");
                return -1;
            }
            return top.data;
        }
        
        // Check if stack is empty
        public boolean isEmpty(){
            return top == null;
        }
    }
}
