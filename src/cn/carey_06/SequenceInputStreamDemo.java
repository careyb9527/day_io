package cn.carey_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;

/*
 *合并流
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream s1 = new FileInputStream("context.xml");
		InputStream s2 = new FileInputStream("server.xml");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.xml"));
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len=sis.read(bytes))!=-1) {
			bos.write(bytes,0,len);
		}
		bos.close();
		sis.close();

	}
}
