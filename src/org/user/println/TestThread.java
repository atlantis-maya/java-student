package org.user.println;

public class TestThread extends Thread{
  private int i=5;
  //这里虽然出现错误的概率很小但是也应该加锁
  @Override
 synchronized public void run(){
	  System.out.println("i--->"+(i--)+"threadName="+Thread.currentThread().getName());
  }
}
