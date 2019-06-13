package org.git.test;

import java.util.Arrays;

public class IntArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12345,4567,2121,5648,7894};
		
				String s[]= new String[a.length];
		
		for (int i=0;i<a.length;i++)
		{
			s[i]=String.valueOf(a[i]);
		}
		
		String str= Arrays.toString(s);
		System.out.println(str);
		

	}

}
