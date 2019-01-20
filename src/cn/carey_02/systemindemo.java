package cn.carey_02;

import java.io.PrintStream;

/*
 * 标准的输入输出流
 * inputstream 输入流
 * printstream 输出流
 * inputstream=system.in
 * printstream=system.out
 * 
 */
public class systemindemo {
	public static void main(String[] args) {
		System.out.println("helloword");
		PrintStream ps=System.out;
		ps.println("helloword");
	}
}
