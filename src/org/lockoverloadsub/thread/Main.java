package org.lockoverloadsub.thread;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月27日 下午9:50:23
* 
*/
public class Main {
	 public int i=10;
	   synchronized public void operateIMethod(){
		   try {
			i--;
			System.out.println("main print i="+i);
			Thread.sleep(1000);
		} catch (Exception e) {
	        e.printStackTrace();
		}
	   }

}
