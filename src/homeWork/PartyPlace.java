package homeWork;

import util.RandomSelectNumber;

public class PartyPlace {

		public static void main(String[] args) {
			// 확인 , 쌀쌀 국수 
			PartyPeopleNoodle jo3 = new PartyPeopleNoodle();
			System.out.println("3조 잔치국수파티");
			
			jo3.boiledNoodle("3");
			// 토핑 재료 추가 
			String[] toppingSource = {"계란",
					"양파","숙주","소고기","애호박","김치"
					,"김"};
			jo3.addTopping(toppingSource);
			
			// 국물 재료 추가 
			String[] soupSource = {"멸치","다시마",
					"새우","향신료"};
			
			jo3.makeSoup(soupSource);
			
			// 양념 재료 추가. 
			String[] source = {"진간장","다진파",
					"다진마늘","고춧가루","맛술","참기름"};
			jo3.makeSource(source);
			
			// 사이즈 1. 보통 2. 곱빼기
			jo3.selectNoodleamount(1);
			
			System.out.println("3조 국수 완성");
			
			// 시식
			String[] eatMembers = {"오현제",
					"문수연","이상용",
					"고도균","김소영"};
			
			// 랜덤하게, 멤버 한명 선택해서 먹기. 
			// util , 패키지 , 자주 사용하는 기능들 모아두기. 
			// RandomSelectNumber, 메서드 명 : selectInt
			int selectedNumberofMember = RandomSelectNumber.selectInt(5);
			// 시식자 선정 완료. 
			System.out.println ("시식하는 사람은 : " + eatMembers[selectedNumberofMember] + " 당첨.ㅋㅋㅋ");
			
		}


	}


