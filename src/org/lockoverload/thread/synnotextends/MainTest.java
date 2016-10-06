package org.lockoverload.thread.synnotextends;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午10:20:03
* 
* 
* 本例中测试的是synchronized修饰的属性不能被继承
*/
public class MainTest {
         public static void main(String[] args) {
			Sub sub =new Sub();
			MyThreadA a= new MyThreadA(sub);
			a.setName("A");
			a.start();
			MyThreadB b= new MyThreadB(sub);
			b.setName("B");
			b.start();
		}
}
