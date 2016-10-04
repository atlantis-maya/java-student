package org.lockoverloadsub.thread;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月29日 下午7:46:40
* 
*/
public class Sub extends Main{
	//public int i=10;
 synchronized public void operateISubMethod(){
	 try {
		while(i>0){
			i--;
			System.out.println("sub print i="+i);
			Thread.sleep(1000);
			
			//this.operateISubMethod();
			this.operateIMethod();
		}
	} catch (Exception e) {
          e.printStackTrace();
	}
 }
}
