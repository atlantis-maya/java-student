package synchroniztion.black.ch2;
/**
 * @author 朱赫    EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月13日 下午10:43:11
 * 
 */
public class TestRun {
	public static void main(String[] args) {
		Task task=new Task();
		MyThread1 thread1= new MyThread1(task);
		thread1.start();
		MyThread2 thread2= new MyThread2(task);
		thread2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long beginTime =CommonUtils.beginTime1;
		if (CommonUtils.beginTime2 <CommonUtils.beginTime1) {
			beginTime =CommonUtils.beginTime2;
		}
		long endTime =CommonUtils.endTime1;
		if (CommonUtils.endTime1 >CommonUtils.endTime1) {
			endTime =CommonUtils.endTime2;
		}
      System.out.println("耗时:"+((endTime-beginTime)/1000));
	}

}
