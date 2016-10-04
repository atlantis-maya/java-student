package org.object.concurrence;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月25日 上午10:31:35
* 
*/
public class MyObject {
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName ="+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endTime="+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//public void methodB()
	synchronized public void methodB(){
		try {
			System.out.println("begin methodB threadName="+Thread.currentThread().getName()
					+"begin time ="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
