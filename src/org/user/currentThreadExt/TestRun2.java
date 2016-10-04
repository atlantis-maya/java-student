package org.user.currentThreadExt;

public class TestRun2 {
          public static void main(String[] args) {
			SleepTest1 sleepTest1 =new SleepTest1();
			System.out.println("begin="+System.currentTimeMillis());
			sleepTest1.start();
			System.out.println("end ="+System.currentTimeMillis());
		}
}
