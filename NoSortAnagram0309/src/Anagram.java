import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Bitcamp
 * ProjectName:NoSortAnagram(������ ������� �ʴ� �Ƴ��׷�)
 * ���� ������ : ������
 * ���� Ǯ�� ����
 * 2���� ���ڿ� �Է� -> ���ĺ� ���� ī���� -> ���� Ȯ��
 *
 */


public class Anagram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//�ΰ��� ���ڿ��� �Է¹޴´�.
		char[] str1=in.nextLine().toLowerCase().toCharArray();
		char[] str2=in.nextLine().toLowerCase().toCharArray();
		
		
		//�ΰ��� ���ڿ����� ���ĺ� ������ Ȯ���Ѵ�.
		int[] alphabetCnt1=new int[26];//a b c d e f g h i j k l m n o p q r s t u v w x y z 26���� ���� 97(a)~122(z)���� 
		for(int i =0;i<str1.length;i++){
			//�Է¹��� ���ڿ� �߿��� �ҹ��ڿ� �ش��ϸ� ī������ �Ѵ�.
			//(a�� ascii�ڵ� ������ 97�� �����ϱ� �迭�� 0��°�� a�� ������ �������� str[i]-97�� �� ��ġ�� ������ �÷��ش�.
			if(str1[i]>='a'&&str1[i]<='z'){
				alphabetCnt1[str1[i]-97]++;//�Է¹��� ������ 1���ڸ� ����
			}
		}
		
		//str2�� ������ ������� ������ ������ üũ���ش�.
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
