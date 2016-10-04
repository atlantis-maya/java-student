package org.user.currentThreadExt;

public class TestRun {

	public static void main(String[] args) {
	/*	CountOperate c= new CountOperate();
		Thread t1=new Thread(c);
		t1.setName("A");
		t1.start();
	*/
		CountOperate_1 countOperate_1=new CountOperate_1();
		Thread t1=new Thread(countOperate_1);
		System.out.println("main begin t1 is Alive="+t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive="+t1.isAlive());

	}

}
