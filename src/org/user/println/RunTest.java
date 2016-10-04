package org.user.println;

public class RunTest {
     public static void main(String[] args) {
		TestThread testThread=new TestThread();
		Thread t1=new  Thread(testThread);
		Thread t2=new  Thread(testThread);
		Thread t3=new  Thread(testThread);
		Thread t4=new  Thread(testThread);
		Thread t5=new  Thread(testThread);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
