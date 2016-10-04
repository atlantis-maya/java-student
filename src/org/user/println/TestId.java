package org.user.println;

public class TestId {
       public static void main(String... args){
    	   Thread runThread=Thread.currentThread();
    	   System.out.println(runThread.getName()+" "+runThread.getId());
       }
}
