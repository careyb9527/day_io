package cn.carey_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 *合并流
 */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		Vector<InputStream> v=new Vector<InputStream>();
		InputStream s1=new FileInputStream("context.xml");
		InputStream s2=new FileInputStream("copy.xml");
		InputStream s3=new FileInputStream("server.xml");
		v.add(s1);
		v.add(s2);
		v.add(s3);
		Enumeration<InputStream> en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.xml"));
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len=sis.read(bytes))!=-1) {
			bos.write(bytes,0,len);
		}
		bos.close();
		sis.close();
	}
}
