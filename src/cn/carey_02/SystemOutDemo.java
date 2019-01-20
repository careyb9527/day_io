package cn.carey_02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemOutDemo {
	public static void main(String[] args) {
		// 获取标准输入流
		InputStream is = System.in;
		// 我要一次获取一行
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	}
}
