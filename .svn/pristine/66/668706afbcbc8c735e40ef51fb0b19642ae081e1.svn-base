package com.google.code;
import java.io.InputStream;
import java.util.Scanner;

public class Console {
	Scanner input;

	public Console(InputStream in) throws Exception {
		if (in == null) {
			throw new Exception("System.in is empty or null!");
		}
		input = new Scanner(in);
	}

	public String readLine(String text) {
		System.out.println(text);
		return input.nextLine();
	}

	public String readPassword(String string) {
		return readLine(string);
	}
}