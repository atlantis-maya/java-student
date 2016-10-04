package org.object.concurrence;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月25日 上午10:46:11
* 
*/
public class MainRun {
     public static void main(String[] args) {
		MyObject object= new MyObject();
		ThreadA a=new ThreadA(object);
		a.setName("A");
		ThreadB b =new ThreadB(object);
		b.setName("B");
		a.start();
		b.start();
		
	}
}
