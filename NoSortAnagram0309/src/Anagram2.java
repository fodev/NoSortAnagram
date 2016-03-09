import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		//두개의 문자열을 입력받는다.
		String str1=in.nextLine();
		String str2=in.nextLine();
		
		if(
				//특정 스트링의 알파벳 갯수를 파악해서 알려주는 함수를 정의 후 그 함수를 이용해서 계산을 한다.
				Arrays.equals(CalcAnagram.getAlphabetCount(str1), CalcAnagram.getAlphabetCount(str2))
		){
			System.out.println("Anagram");
		}else{
			System.out.println("No Anagram");
			
		}
	}

}