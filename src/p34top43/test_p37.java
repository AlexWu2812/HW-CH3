package p34top43;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p37 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J�^��r��");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String strup = str.toUpperCase();
		String strlow = str.toLowerCase();
		System.out.println("�ഫ���j�g�ɬ�"+strup);
		System.out.println("�ഫ���p�g�ɬ�"+strlow);
	}
}

