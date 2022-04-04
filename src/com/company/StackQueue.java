package com.company;

import java.util.*;

public class StackQueue {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi = ");
        String str = scanner.next();
        boolean check = true;
        Stack stack = new Stack<>();
        Queue<Character> strings = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            strings.offer(str.charAt(i));
        }

        System.out.println("stack = "+stack);
        System.out.println("queue = "+strings);
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop()==strings.poll()){
                check = true;
            }else check = false;
        }
        if (check){
            System.out.println("là chuỗi Palindrome");
        }else System.out.println("không là chuỗi Palindrome");
    }
}
