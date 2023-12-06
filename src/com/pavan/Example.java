package com.pavan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		
		String res = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)).collect(Collectors.joining());
		System.out.println(res);
	}
}
