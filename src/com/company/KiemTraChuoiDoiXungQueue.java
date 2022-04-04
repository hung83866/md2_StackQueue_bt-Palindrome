package com.company;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class KiemTraChuoiDoiXungQueue {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }
        String newStr = "";
        while (!queue.isEmpty()) {
            newStr = newStr+queue.remove();
        }
        if (str.equals(newStr))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
