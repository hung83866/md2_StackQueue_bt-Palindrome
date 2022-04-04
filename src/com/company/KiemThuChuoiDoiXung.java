package com.company;

import java.util.Stack;
import java.util.Scanner;
class KiemTraChuoiDoiXungStack {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi");
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String newStr = "";

        while (!stack.isEmpty()) {
            newStr = newStr+stack.pop();
        }
        if (str.equals(newStr))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không là chuỗi đối xứng.");
    }
}
