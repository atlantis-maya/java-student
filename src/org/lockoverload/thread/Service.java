package org.lockoverload.thread;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月27日 下午9:39:16
* 
*/
public class Service {
	synchronized public void service_1(){
		System.out.println("service_1");
		service_2();
	}
	synchronized public void service_2(){
		System.out.println("service_2");
		service_3();
	}
	synchronized public void service_3(){
		System.out.println("service_3");
	}

}
