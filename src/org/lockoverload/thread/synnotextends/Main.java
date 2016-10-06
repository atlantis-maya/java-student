package org.lockoverload.thread.synnotextends;

/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午10:02:14
* 
*/
public class Main {
	synchronized public void serviceMethod(){
		try {
			
			System.out.println("int main 下一步 sleep begin threadName= "+Thread.currentThread().getName()
					+"time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int main 下一步sleep end threadName= "+Thread.currentThread().getName()
					+" time=" +System.currentTimeMillis());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
