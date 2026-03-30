package hw3;

import java.util.Scanner;
/*
 * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
對則顯示正確訊息,如圖示結果:
 */

public class No2 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
//		int min = 0;
//		int max =100;
//		(提示範圍:"+min+"~"+max+")
		int i = (int)(Math.random() * 101);
		while (true) {
		    System.out.print("請輸入一個數字:");
		
		    int num = sc.nextInt();

		    if (num == i) {
		        System.out.println("恭喜猜對!!!!");
		        break; // 猜對就跳出迴圈
		    } else if(num < 0 || num > 100) {
		        System.out.println("輸入的數字不再範圍內,不要亂打!!!!");
		    }else if(num > i) {
		    	System.out.println("比答案大,再加油");
//		    	max=num;
//		    	System.out.println("(提示範圍:1~" +max+")");
		    }
		    else {
		        System.out.println("比答案小,繼續加油");
//		        min=num;
//		        System.out.println("(提示範圍:"+min+"~"+"100)");
		    }
		}
	}
}
