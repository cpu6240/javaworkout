package chapter2;

public class Typelnference {
	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);		//int i = 10으로 컴파일됨
		System.out.println(j);		//double j = 10.0으로 컴파일됨
		System.out.println(str);	//String str = "hello" 로 컴파일됨
		
		str = "test";				//다른 문자열 대입 가능
		//str = 3;					//이미 String으로 선언되었기 대문에 정수 값은 대입할 수 없음
		
		System.out.println(str);	//대체된 문자열로 변환되어 출력됨
	}

}
