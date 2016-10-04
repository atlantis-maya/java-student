package org.object.concurrence;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月25日 上午10:44:14
* 
*/
public class ThreadB extends Thread {
      private MyObject object;
      public ThreadB(MyObject object){
    	  this.object=object;
      }
      @Override
      public void run(){
    	  object.methodB();
      }
}
