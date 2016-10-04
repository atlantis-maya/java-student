package org.user.currentThreadExt;

public class TestRun1 {
            public static void main(String[] args) {
				SleepTest sTest= new SleepTest();
				System.out.println("begin ="+System.currentTimeMillis());
				sTest.run();
				System.out.println("end ="+System.currentTimeMillis());
			}
}
