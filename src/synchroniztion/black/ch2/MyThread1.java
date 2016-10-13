package synchroniztion.black.ch2;
/**
 * @author 朱赫    EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月13日 下午10:35:36
 * 
 */
public class MyThread1 extends Thread {
          private Task task;
          public MyThread1(Task task){
        	  super();
        	  this.task=task;
          }
          @Override
          public void run(){
        	  super.run();
        	  CommonUtils.beginTime1=System.currentTimeMillis();
        	  task.doLoginTimeTask();
        	  CommonUtils.endTime1=System.currentTimeMillis();
        	  
          }
          
}
