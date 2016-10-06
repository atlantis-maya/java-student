package org.lockoverload.thread.exception;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午9:45:58
* 
*/
public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
    	super();
    	this.service=service;
    }
    @Override
    public void run(){
    	service.testMethod();
    }
}
