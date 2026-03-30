package hw3;

import java.util.Scanner;

/*
 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
的號碼與總數,如圖:
 */
public class No3 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		
		// 建立 1~49 的號碼
        int[] numbers = new int[49];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 輸入不喜歡的數字 (1~9)
        System.out.print("請輸入你不想要的數字 (1~9): ");
        int num = sc.nextInt();

        System.out.println("你可以選擇的號碼有:");
        int count = 0;
        for (int i = 1; i <= 49; i++) {
            int ones = i % 10;      // 個位數
            int tens = i / 10;      // 十位數
            if (ones == num || tens == num) {
                continue; // 跳過含有討厭數字的號碼
               
            }
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.print("總共有:"+count+"個");
	}
}
