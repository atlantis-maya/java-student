package org.user.currentThreadExt;

public class CountOperate_1 extends Thread{
		public CountOperate_1(){
			System.out.println("CountOperate_1----begin");
			System.out.println("Thread.currentThread().getName()="
			+Thread.currentThread().getName());
			System.out.println("Thread.currentThread().isAlive()="
					+Thread.currentThread().isAlive());
			System.out.println("this.getName()="+this.getName());
			System.out.println("this.isAlive()="+this.isAlive());
			System.out.println("CountOperate_1-----end");
		}
		@Override
		public void run(){
			System.out.println("run-----begin");
			System.out.println("Thread.currentThread().getName()="
			+Thread.currentThread().getName());
			System.out.println("Thread.currentThread().isAlive()="
			+Thread.currentThread().isAlive());
			System.out.println("This.getName()="+this.getName());
			System.out.println("This.isAlive()="+this.isAlive());
			System.out.println("run-------end");
		}
}
