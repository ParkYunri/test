import java.util.*;

public class StringTokenizerEx {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String str;
				
		System.out.print("�Է� : ");
		str = s.next();
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, "://."); //�Է¹��� str���ڿ����� : // . <- �ش� ���ڵ��� ���� ��� ����
		while(st.hasMoreElements())
			System.out.println(st.nextElement());
	}
}
