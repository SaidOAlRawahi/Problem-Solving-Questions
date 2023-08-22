package org.example;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to verify brackets validity: ");
        String stringToVerify = scanner.next();
        Stack<Character> bracketsStack = new Stack<Character>();
        boolean isValid = true;

        try{
            for(Character c: stringToVerify.toCharArray()){
                switch (c){
                    case '(':
                    case '{':
                    case '[':
                        bracketsStack.push(c);
                        break;

                    case ')':
                        if(bracketsStack.pop() != '('){
                            isValid = false;
                        }
                        break;
                    case '}':
                        if(bracketsStack.pop() != '{'){
                            isValid = false;
                        }
                        break;
                    case ']':
                        if(bracketsStack.pop() != '['){
                            isValid = false;
                        }
                        break;

                    default:
                        break;
                }
                if (!isValid){
                    break;
                }
            }
            if (!bracketsStack.isEmpty()){
                isValid = false;
            }
        }
        catch (EmptyStackException e){
            isValid = false;
        }

        if (isValid){
            System.out.println("\nThe String (" + stringToVerify + ") is Valid");
        }
        else {
            System.out.println("\nThe String (" + stringToVerify + ") is NOT Valid");
        }
    }
}