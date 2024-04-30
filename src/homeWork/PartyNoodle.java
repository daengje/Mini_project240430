package homeWork;

public abstract class PartyNoodle implements Noodle{
	// 면류 인터페이스를 상속 받은 쌀국수 인터페이스 
		public final static String price = "보통 4000원";
		
		// 쌀국수만의 기능, 
		// 면 굵기 조절하게 
		public abstract void selectNoodleamount(int selectNoodleamountNumber);

}
