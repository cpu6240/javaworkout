package chapter4;

public class SwitchCase3 {
	public static void main(String[] args) {
		int elevator = 5;
		
		switch(elevator) {
		case 1 :
		System.out.println(elevator+"층 약국입니다.");
			break;
		case 2 :
		System.out.println(elevator+"층 정형외과입니다.");
			break;
		case 3 :
		System.out.println(elevator+"층 피부과입니다.");
			break;
		case 4 :
		System.out.println(elevator+"층 약국입니다.");
			break;
		case 5 :
			System.out.println(elevator+"층 헬스 클럽입니다.");
			break;
		default :
		System.out.println("없는 층입니다.");
		}
	}
}
