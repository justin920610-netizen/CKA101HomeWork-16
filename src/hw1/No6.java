package hw1;

public class No6 {
  public static void main(String[]args) {
	  /*
	   * 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
         5 + 5
         5 + ‘5’
         5 + “5”
         並請用註解各別說明答案的產生原因
	  */
	  System.out.println(5+5);//兩個都是整數所以相加=10
	  System.out.println(5+'5');//5是整數,'5'是字,由於unicode表5轉換成整數是53,53+5=58
	  System.out.println(5+"5");//5是整數,"5"是字串,加起來=55
	  
	  
  }
}
