package test;

public class ThreadTest {
	public static void main(String args[]){
		Counter ct=new Counter();
		CounterR cr = new CounterR();
		Thread th = new Thread(cr);
		ct.start();
		th.start();
		System.out.println("The thread has been started");
		for(int j=1;j<5;j++){
			System.out.println("j: "+j);
		}
	
		
	}
}
class Counter extends Thread{
	public void run(){
		for(int i =1; i <=5 ; i++){
			System.out.println("count: "+i);
		}
	}
	
}
class CounterR implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i<=5; i++)
		System.out.println("Runnable: "+i);
	}
	
}
