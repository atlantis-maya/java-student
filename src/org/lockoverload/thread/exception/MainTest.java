package org.lockoverload.thread.exception;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午9:52:14
* 
* 
* 在本例中会发现线程a出现异常后将锁释放了,线程b进入方法正常打印值
* 出现异常的锁被自动释放了
*/
public class MainTest {
      public static void main(String[] args) {
		try {
			Service service=new Service();
			ThreadA a=new ThreadA(service);
			a.setName("a");
			a.start();
			Thread.sleep(500);
			ThreadB b=new ThreadB(service);
			b.setName("b");
			b.start();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
