package cn.carey_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		/*
		 * properties  属性集合类，是一个和io流可以相结合的类
		 * properties  可保存在流中或从流中加载，属性列表中每个键的及其对应的值都是一个字符串
		 * 是hashtble的一个子类，说明是一个map集合
		 * 
		 */
		Properties prop=new Properties();
		
		System.out.println("prop"+prop);
		//添加元素
		prop.put("carey1", "hello");
		prop.put("carey2", "word");
		prop.put("carey3", "java");
		//遍历集合
		Set<Object> set=prop.keySet();
		for (Object key: set) {
			Object value = prop.get(key);
			System.out.println(key+"-----"+value);
		}
		
	}
}
