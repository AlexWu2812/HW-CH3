package p34top43;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p37 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入英文字母");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String strup = str.toUpperCase();
		String strlow = str.toLowerCase();
		System.out.println("轉換成大寫時為"+strup);
		System.out.println("轉換成小寫時為"+strlow);
	}
}

