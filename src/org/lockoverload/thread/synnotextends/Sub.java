package org.lockoverload.thread.synnotextends;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午10:03:14
* 
*/
public class Sub extends Main{
	 @Override
	 public void serviceMethod(){
		 try {

			 System.out.println("int sub 下一步 sleep begin threadName= "+Thread.currentThread().getName()+
					 " time= "+System.currentTimeMillis());
			 Thread.sleep(5000);
			 System.out.println("int sub 下一步 sleep end threadName= "+Thread.currentThread().getName()
					 + " time= "+System.currentTimeMillis());
			 super.serviceMethod();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }

}
