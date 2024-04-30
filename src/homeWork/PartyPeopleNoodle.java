package homeWork;

public class PartyPeopleNoodle extends PartyNoodle {
	
	private String NoodleSize;
	
	public String getNoodleSize() {
		return NoodleSize;
	}

	// 쌀쌀 국수
	@Override
	public void boiledNoodle(String boiledTime) {
		System.out.println("물을 " + boiledTime + "분 동안 끊이기");

	}

	@Override
	public void addTopping(String[] ToppingSources) {
		for (int i = 0; i < ToppingSources.length; i++) {
			System.out.println("토핑 추가 " + (i + 1) + " : " + ToppingSources[i]);
		}

	}

	@Override
	public void makeSoup(String[] SoupSources) {
		for (int i = 0; i < SoupSources.length; i++) {
			System.out.println("육수 재료 추가 " + (i + 1) + " : " + SoupSources[i]);
		}

	}

	@Override
	public void makeSource(String[] Sources) {
		for (int i = 0; i < Sources.length; i++) {
			System.out.println("양념 재료 추가 " + (i + 1) + " : " + Sources[i]);
		}

	}

	@Override
	public void selectNoodleamount(int selectNoodleamountNumber) {
		if (selectNoodleamountNumber == 1) {
			this.NoodleSize = ("보통 사이즈");
			//System.out.println("보통 사이즈");
		} else {
			this.NoodleSize = ("곱빼기 사이즈");
			//System.out.println("곱빼기 사이즈");
		}

	}
}



