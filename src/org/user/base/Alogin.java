package org.user.base;

 public  class Alogin extends Thread {
      @Override
      public  void run(){
    	  //LoginServlet.doPost("a", "aa");
    	  PlusLoginServlet.doPost("a", "aa");
      }
}
