package org.lockoverload.thread.synnotextends;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午10:05:01
* 
*/
public class MyThreadB extends Thread {
	private Sub sub;
	public MyThreadB(Sub sub){
		this.sub=sub;
	}
	@Override
	public void run(){
		sub.serviceMethod();
	}
}
