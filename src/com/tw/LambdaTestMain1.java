package com.tw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * JAVA8 的 Lambda 學習(1)
 * </p>
 * 
 * @author miles
 * @version 1.0, 2018/09/28
 * @see
 * @since
 */
public class LambdaTestMain1 {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Google ");
		names1.add("Runoob ");
		names1.add("Taobao ");
		names1.add("Baidu ");
		names1.add("Sina ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Google ");
		names2.add("Runoob ");
		names2.add("Taobao ");
		names2.add("Baidu ");
		names2.add("Sina ");

		// lambda 基本使用
		LambdaTestMain1 tester = new LambdaTestMain1();
		System.out.println("使用 Java 7 语法: ");

		tester.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("使用 Java 8 语法: ");

		tester.sortUsingJava8(names2);
		System.out.println(names2);

	}
	
	/**
	 * 使用JAVA7 以前的排序方式
	 * 
	 * @param names
	 * @return
	 * 
	 */
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	/**
	 * 使用JAVA8 Lambda排序方式
	 * 
	 * @param names
	 * @return
	 * 
	 */
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
