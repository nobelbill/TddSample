package com.nobelbill.quiz1;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Quiz1 {
	public static void main(String[] args) {
		char[] res = split("ab");
		System.out.println(res[0]);
	}

	public String sort(String string) {
		return null;
	}

	public static char[] split(String string) {
		char[] result = null;
		result = string.toCharArray();
		return result;
	}

	public static char[] sortArray(char[] real) {
		// TODO Auto-generated method stub
		Arrays.sort(real);
		return real;
	}

	public static String mergeString(char[] test) {
		// TODO Auto-generated method stub
		String result = null;
		result = String.valueOf(test);
		return result;
	}

	public static String sortString(String input) {
		// TODO Auto-generated method stub
		String result = null;
		result = mergeString(sortArray(split(input)));
		return result;
	}

}
