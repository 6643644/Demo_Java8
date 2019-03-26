# Java8

函數式接口 "Function Interface" 又稱之為 功能性接口。
函數式接口只包含一個方法的接口，例如 java.lang.Runnable、java.lang.Compartor。
Java8 提供 @FunctionalInterface 註解，該註解非必須，JVM會自行判斷。

範例(1):java.lang.Runnable

傳統寫法:
new Thread(new Runnable(){
	@Override 
	public void run(){
		System.out.println("傳統寫法");
	}
}).start();

Lambda寫法:
new Thread(()->System.out.println("Lambda寫法")).start();

範例(2):一級函式

f(x) = x * 2 
可以寫成
x -> x * 2

可以解析為
input -> body

input 可以細分為
不輸入()
一個參數 x 
多個參數 (int x,int x2) 也可以不用寫入型態

body 可以細分為
甚麼都不做 {}
單行不回傳值 System.out.println("A");
多行不回傳值 
{
	System.out.println("A");
	System.out.println("B");
}
單行回傳值 x * 2
多行回傳值
{ 
	x++;
	y--; 
	return x+y; 
}

解析公式
1.f(x) = x * 2
(x -> x * 2)(2)
= 2 * 2
= 4

2.
g(y) = y - 1 代入 f(x) 匿名的表達為
(y-> y - 1)(x-> x * 2)
= x -> x * 2 - 1


添加其他Java基本的計算與檢核，盡量使用java8 以上語法。





  
  
