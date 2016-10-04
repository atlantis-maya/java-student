package org.user.base;
/**
 * 测试多线程对普通类的影响
 * @author Administrator
 *
 */
public class RunTest {
      public static void main(String[] args) {
		Alogin alogin=new Alogin();
		alogin.start();
		Blogin blogin=new Blogin();
		blogin.start();
	}
}
