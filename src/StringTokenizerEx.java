import java.util.*;

public class StringTokenizerEx {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String str;
				
		System.out.print("입력 : ");
		str = s.next();
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, "://."); //입력받은 str문자열에서 : // . <- 해당 문자들이 있을 경우 삭제
		while(st.hasMoreElements())
			System.out.println(st.nextElement());
	}
}
