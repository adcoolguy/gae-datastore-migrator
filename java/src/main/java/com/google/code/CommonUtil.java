package com.google.code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;

public class CommonUtil {

	public static InputStream getResourceAsStream(String fileName) throws Exception {
		URL url =  ClassLoader.getSystemResource(fileName);
//	    FileReader fileReader = new FileReader(url.getFile());
		InputStream inputStream = new FileInputStream(url.getFile());

		return inputStream;
	}
    
}
