package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyStack myStack = new MyStack();
        myStack = operation(myStack, 50);
        String str = "";
        while(!myStack.isEmpty()){
            str += String.valueOf(myStack.pop());
        }
        System.out.println("After convert: "+str);
    }

    public static MyStack operation(MyStack myStack, int number){
        if(number != 0){
            myStack.push(number%2);
            operation(myStack, number/2);
        }
        return myStack;
    }

}
