package org.lockoverloadsub.thread;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月27日 下午9:48:21
* 
* 可重入锁具有继承属性
*/
public class MainTest {
     public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
	}
} 
