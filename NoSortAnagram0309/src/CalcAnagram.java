import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CalcAnagram {
	public static int[] getAlphabetCount(String str){
		char[] charStr=str.toLowerCase().toCharArray();//스트링을 char[]로 만든다.
		int[] cnt=new int[26];
		
		for(int i =0;i<charStr.length;i++){
			if(charStr[i]>='a'&&charStr[i]<='z'){
				cnt[charStr[i]-97]++;//해당 알파벳의 위치 0:a 1:b .... 25:z 에 갯수를 체크해준다.
			}
		}
		
		return cnt;//카운팅한 알파벳을 리턴해준다.
	}
	
}
