package com.app.test;

public class StringOpers {
	public static boolean isFollwingABCCycle(String str) {
		char[] arr = str.toCharArray();
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(getNext(arr[i]) + "..>" + arr[i]);
			if (!getNext(arr[i]).equals(arr[i])) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private static Character getNext(char c) {
		if (c == 'A')
			c = 'B';
		else if (c == 'B')
			c = 'C';
		else if (c == 'C')
			c = 'A';
		return c;
	}
}
