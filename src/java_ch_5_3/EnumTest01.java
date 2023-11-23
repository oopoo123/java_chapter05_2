package java_ch_5_3;

public class EnumTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today; // 열거타입변수 선언
		Week nextDay = Week.SATURDAY;
		
		today = Week.THURSDAY;
		
		Score score1, score2;
		score1 = Score.A;
		score2 = Score.B;
		
		int s1 = 85;
		
		if(s1 >= 90) {
			System.out.print(score1);
		}else if(s1 >= 80) {
			System.out.print(score2);
		}
		

	}

}
