package hw1;
//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class No4 {
	public static void main(String[]args) {
		//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
       double pi = 3.1415 ;
       int r = 5 ;
       double area = pi * Math.pow(r, 2) ;
	    System.out.printf("圓面積 = %.2f"+"平方公分%n", area);
	   double Circumference = pi * (r * 2 );
	   System.out.printf("圓周長 = %.2f " + "公分%n",Circumference );
       
	
	}

}
