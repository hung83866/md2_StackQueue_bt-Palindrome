package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi = ");
        String str = scanner.next();
        boolean check = true;
        Stack stack = new Stack<>();
        PriorityQueue queue = new PriorityQueue();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }
        System.out.println("stack = "+stack);
        System.out.println("queue = "+queue);
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop()==queue.remove()){
                check = true;
            }else check = false;
        }
        if (check){
            System.out.println("là chuỗi Palindrome");
        }else System.out.println("không là chuỗi Palindrome");
    }
}
