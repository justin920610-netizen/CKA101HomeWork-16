package hw3;

import java.util.Scanner;
/*
 * 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
三角形、其它三角形或不是三角形,如圖示結果:
 */
public class No1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.print("請輸入三個整數: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//sc.nextInt();	
		
	if(num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2) {
		if(num1 == num2 && num2 ==num3){
			System.out.println("正三角形");
		}else if(num1 == num2 || num2 == num3 || num3 == num1) {
			System.out.println("等腰三角形");
		}else if(num1 != num2 && num2 !=num3 && num3 != num1) {
			System.out.println("其他三角形");
	    }
		
		}else {
	    
			System.out.println("不是三角形");
		}
	 		sc.close();
	 }
  }

