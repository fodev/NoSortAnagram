import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		//�ΰ��� ���ڿ��� �Է¹޴´�.
		String str1=in.nextLine();
		String str2=in.nextLine();
		
		if(
				//Ư�� ��Ʈ���� ���ĺ� ������ �ľ��ؼ� �˷��ִ� �Լ��� ���� �� �� �Լ��� �̿��ؼ� ����� �Ѵ�.
				Arrays.equals(CalcAnagram.getAlphabetCount(str1), CalcAnagram.getAlphabetCount(str2))
		){
			System.out.println("Anagram");
		}else{
			System.out.println("No Anagram");
			
		}
	}

}