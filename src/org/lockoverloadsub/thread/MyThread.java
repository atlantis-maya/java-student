package org.lockoverloadsub.thread;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月29日 下午7:51:31
* 
*/
public class MyThread extends Thread {
	      @Override
          public void run(){
        	  Sub sub=new Sub();
        	  sub.operateIMethod();
        	  sub.operateISubMethod();
          }
}
