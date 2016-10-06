package org.lockoverload.thread.exception;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午9:46:07
* 
*/
public class ThreadB extends Thread{
	 private Service service;
	 public ThreadB(Service service){
		 super();
		 this.service=service;
	 }
	 @Override
    public void run(){
    	service.testMethod();
    }
}
