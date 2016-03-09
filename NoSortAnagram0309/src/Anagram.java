import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Bitcamp
 * ProjectName:NoSortAnagram(정렬을 사용하지 않는 아나그램)
 * 문제 출제자 : 김현준
 * 문제 풀이 순서
 * 2개의 문자열 입력 -> 알파벳 갯수 카운팅 -> 갯수 확인
 *
 */


public class Anagram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//두개의 문자열을 입력받는다.
		char[] str1=in.nextLine().toLowerCase().toCharArray();
		char[] str2=in.nextLine().toLowerCase().toCharArray();
		
		
		//두개의 문자열들의 알파벳 개수를 확인한다.
		int[] alphabetCnt1=new int[26];//a b c d e f g h i j k l m n o p q r s t u v w x y z 26개의 문자 97(a)~122(z)까지 
		for(int i =0;i<str1.length;i++){
			//입력받은 문자열 중에서 소문자에 해당하면 카운팅을 한다.
			//(a는 ascii코드 값으로 97을 가지니까 배열의 0번째에 a의 갯수를 넣을려면 str[i]-97을 한 위치에 갯수를 올려준다.
			if(str1[i]>='a'&&str1[i]<='z'){
				alphabetCnt1[str1[i]-97]++;//입력받은 문자중 1글자를 가지
			}
		}
		
		//str2도 동일한 방법으로 숫자의 갯수를 체크해준다.
		int[] alphabetCnt2=new int[26];
		for(int i =0;i<str2.length;i++){
			if(str2[i]>='a'&&str2[i]<='z'){
				alphabetCnt2[str2[i]-97]++;
			}
		}
		
		if(Arrays.equals(alphabetCnt1, alphabetCnt2)){
			System.out.println("anagram");
		}else{
			System.out.println("no anagram");
		}
	}
}
