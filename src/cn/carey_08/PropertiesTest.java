package cn.carey_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 
 *	
 *	我有一个文本文件，我知道数据是键值对形式 的，但是不知道内容是什么。
 *请写一个程序是否有“lisi”，这样的键存在，如果有就改变其值wei100
 *分析：
 *	把文件中的数据加载到集合中去
 *	遍历集合，获取得到的每一个键，
 *	判断是否有为李四的，如果有就修改其值为100；
 *	把集合数据重新存储到文件中
 *
 *	
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		//把文件中的数据加载到集合中去
		Properties prop=new Properties();
		Reader r=new FileReader("name.txt");
		prop.load(r);
		r.close();
		
		//遍历集合
		Set<String> set=prop.stringPropertyNames();
		for (String key : set)  {
			if ("lisi".equals(key)) {
				prop.setProperty(key, "100");
				break;
			}
		}
		Writer w=new FileWriter("name.txt");
		prop.store(w, "修改李四");
	}
	
	
}
