package cn.carey_05;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 随机访问流
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		
		
	}
}
