package org.lockoverload.thread;
/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年9月27日 下午9:42:26
* 
*/
public class MyThread extends Thread {
         public void run(){
        	 Service service=new Service();
        	 service.service_1();
    
         }
}
