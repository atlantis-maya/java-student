package org.object.concurrence;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月25日 上午10:41:19
* 
*/
public class ThreadA extends Thread {
     private MyObject object;
     public ThreadA(MyObject object){
    	 super();
    	 this.object=object;
     }
     @Override
     public void run(){
    	 super.run();
    	 object.methodA();
    	 
     }
}
