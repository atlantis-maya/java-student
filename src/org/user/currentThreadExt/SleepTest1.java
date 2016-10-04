package org.user.currentThreadExt;

public class SleepTest1 extends  Thread {
         @SuppressWarnings("static-access")
		@Override
         public  void run(){
        	 try {
			  System.out.println("run threadName=-------------->"+
        	 this.currentThread().getName()+"begin ="+System.currentTimeMillis());
			  Thread.sleep(2000);
			  System.out.println("run threadName=------------>"+this.currentThread().getName()
			 +"end ="+System.currentTimeMillis());
			} catch (Exception e) {
			 e.printStackTrace();
			}
         }
}
