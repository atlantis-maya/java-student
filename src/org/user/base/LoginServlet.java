package org.user.base;

public class LoginServlet {
    //本类模拟一个servlet组件
	private static String usernameRef;
	private static String passwordRef;
	public static void doPost(String username,String password){
		try{
			usernameRef=username;
			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passwordRef=username;
			System.out.println("username="+usernameRef+"password="+passwordRef);
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
}
