package com.chahar;


public class HelloWorld {
	
	static {
		Thread hook1 = new Thread(){
			public void run(){
				System.out.println("Hook1 called");
			}
		};
		
		Thread hook2 = new Thread(){
			public void run(){
				System.out.println("Hook2 called");
			}
		};
		
		Runtime.getRuntime().addShutdownHook(hook1);
		Runtime.getRuntime().addShutdownHook(hook2);
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("****************** Welcome to Hello World **************************");
		
		boolean stackOverFlow=false;
		boolean outOfMemory=false;
		boolean unlimitedSleep=false;

	    for(int i=0;i<args.length;i++){
	    	System.out.println("argument["+i+"]="+args[i]);
	    	
	    	if("testStackOverFlow".equals(args[i])) {
	    		stackOverFlow=true;
	    	}
	    	if("testOutOfMemory".equals(args[i])) {
	    		outOfMemory=true;
	    	}
	    	if("testUnlimitedSleep".equals(args[i])) {
	    		unlimitedSleep=true;
	    	}
	    }
	    
	    //Thread.sleep(5000);

	    if(stackOverFlow) { testRecusion(); }

	    if(outOfMemory){
	    	long[] l = new long[Integer.MAX_VALUE];
	    }
	        
	    if(unlimitedSleep) {
	    	while(true){
	    		Thread.sleep(1000);
	    		System.out.print(".");
	    	}
	    }
	    
	    System.out.println(" ********** Hello World FINISHED ****************** ");
	}
	
	public static void testRecusion(){
		testRecusion();
	}
	
}
