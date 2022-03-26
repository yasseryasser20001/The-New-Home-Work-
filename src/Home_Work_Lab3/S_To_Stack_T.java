package Home_Work_Lab3;

import java.util.Stack;

public class S_To_Stack_T {
    public static void main(String[] args) {
    int [] a = {1,2,3,4,5};
    Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();
        for (int i = 0; i <5 ; i++) {
        firstStack.push(a[i]);
    }
        System.out.println("Top of the Stack is = " + firstStack.peek());
        for (int i = 0; i <5 ; i++) {
        secondStack.push(firstStack.pop());
    }
        System.out.println("The Top of the Second Stack is  = " + secondStack.peek());

  }
}