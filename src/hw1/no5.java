package hw1;

public class no5 {
   public static void main(String [] args) {
	   /*
	    * 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	      金加利息共有多少錢 (用複利計算，公式請自行google)
	   */
	   int money= 1_500_000 ;
	   double  r   = 0.02 ;
	   double  FV   = money * Math.pow(1+r,10);
	   System.out.printf("本金加利息= %.2f"+"元 %n ",FV);
	   
   }
}
