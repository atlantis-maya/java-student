package synchroniztion.black.ch2;
/**
 * @author 朱赫    EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月13日 下午10:22:06
 * 
 */
public class Task {
	private String getData1;
	private String getData2;
	public synchronized void doLoginTimeTask(){
		try {
			System.out.println("begin Task");
	        Thread.sleep(3000);
	        getData1="长时间处理任务后从远程返回的值1 threadName="
	        		+Thread.currentThread().getName();
	        getData2="长时间处理任务后从远程返回的值2 threadName="
	        		+Thread.currentThread().getName();
	        System.out.println("getDate1");
	        System.out.println("getDate2");
	        System.out.println("end task");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
