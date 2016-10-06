package org.lockoverload.thread.synnotextends;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年10月6日 下午10:03:41
* 
*/
public class MyThreadA extends Thread {
       private Sub sub;
       public MyThreadA(Sub sub){
    	   super();
    	   this.sub=sub;
       }
       public void run(){
    	   sub.serviceMethod();
       }
}
