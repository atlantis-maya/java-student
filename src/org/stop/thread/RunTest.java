package org.stop.thread;

public class RunTest {
       @SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			StopTest stopTest =new StopTest();
			stopTest.start();
			Thread.sleep(1000);
			stopTest.interrupt();
			System.out.println("是否停止1?="+stopTest.interrupted());
			System.out.println("是否停止2?="+stopTest.interrupted());
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
