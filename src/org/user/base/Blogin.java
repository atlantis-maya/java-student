package org.user.base;

public  class Blogin  extends Thread{
	  @Override
      public  void run(){
		 // LoginServlet.doPost("b", "bb");
    	  PlusLoginServlet.doPost("b", "bb");
      }
}
