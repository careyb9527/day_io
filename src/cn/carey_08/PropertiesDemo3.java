package cn.carey_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 必须是properties集合
 * public void load(Reader reader)把文件的数据读取到集合中
 * 
 * public void store(Writer writer,String comments)把集合的数据存储到文件中
 *	单机版的游戏
 *		进度保存，和加载
 */
public class PropertiesDemo3 {
	public static void main(String[] args) {
		// myload();
		// mystore();

		System.out.println(jiecheng(-5));
	}

	public static int jiecheng(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x * jiecheng(x - 1);
					/*5*jiecheng(4)
					 * 	4*jiecheng(3)
					 * 		3*jiecheng(2)
					 * 			2*jiecheng(1)
					 * 					1
					 * 	5*4*3*2*1
					 */	
		}

	}

	private static void mystore() {
		Properties prop = new Properties();
		prop.setProperty("刘意", "20");
		prop.setProperty("吴鑫", "30");
		prop.setProperty("班长", "40");
		try {
			Writer w = new FileWriter("name.txt");
			prop.store(w, "helloword");
			w.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void myload() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileReader fileReader = new FileReader("prop.txt");
		prop.load(fileReader);
		fileReader.close();
		System.out.println(prop);

	}
}
