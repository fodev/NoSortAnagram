import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CalcAnagram {
	public static int[] getAlphabetCount(String str){
		char[] charStr=str.toLowerCase().toCharArray();//��Ʈ���� char[]�� �����.
		int[] cnt=new int[26];
		
		for(int i =0;i<charStr.length;i++){
			if(charStr[i]>='a'&&charStr[i]<='z'){
				cnt[charStr[i]-97]++;//�ش� ���ĺ��� ��ġ 0:a 1:b .... 25:z �� ������ üũ���ش�.
			}
		}
		
		return cnt;//ī������ ���ĺ��� �������ش�.
	}
	
}
