package hw1;

public class no3 {
 public static void main(String[]args) {
	 // 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	 double sec=256559;
	 double day=sec/24/Math.pow(60 , 2);
//		System.out.println("為 " + day+"天");
		System.out.printf("天數 = %.2f"+"天%n", day);
	 double hour=sec/Math.pow(60, 2);
		System.out.printf("小時 = %.2f"+"小時%n", hour);
	 double min=sec/60;
	    System.out.printf("分鐘 = %.2f"+"分鐘%n", min);
	    System.out.printf("秒數 = %.2f"+"秒數%n",sec);
	 }
 
}
