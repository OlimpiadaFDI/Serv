package com.fdi.olimpiada.commons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * @author agonzalez
 *
 */

public class FileManager {

	public static void byteArrayToFile(byte[] file, String ruta) throws Exception {
		OutputStream out=null;
		try {
			out = new FileOutputStream(ruta);
			out.write(file);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (out!=null)
				out.close();
		}
	}

	public static byte[] fileToByteArray(File file) throws Exception {
		FileInputStream fileInputStream=null;
		byte[] b = new byte[(int) file.length()];
		try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(b);
			fileInputStream.close();
		} catch (IOException e1) {
			System.out.println("Error Reading The File.");
			e1.printStackTrace();
		}finally{
			if (fileInputStream!=null)
				fileInputStream.close();
		}

		return b;
	}

}
