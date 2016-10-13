package synchroniztion.black.ch2;
/**
 * @author 朱赫    EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月13日 下午10:39:44
 * 
 */
public class MyThread2 extends Thread {
         private Task task;
         public MyThread2(Task task){
        	 super();
        	 this.task=task;
         }
         @Override
         public void run(){
        	 super.run();
        	 CommonUtils.beginTime2=System.currentTimeMillis();
        	 task.doLoginTimeTask();
        	 CommonUtils.endTime2=System.currentTimeMillis();
         }
}
