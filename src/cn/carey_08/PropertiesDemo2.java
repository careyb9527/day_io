package cn.carey_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
	public static void main(String[] args) {
		/*
		 * 特殊功能 
		 * public Object setProperty(String key,String value) 
		 * public String getProperty(String key) 
		 * public Set<String> stringPropertyNames()
		 *
		 */
		Properties prop=new Properties();
		//添加元素
		prop.setProperty("张三", "30");
		prop.setProperty("李四", "40");
		prop.setProperty("王五", "50");
		Set<String> set=prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key+"-----"+value);
		}
	}
}
