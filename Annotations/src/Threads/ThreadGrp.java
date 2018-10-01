package Threads;


//this is new test in tortoise Git



public class ThreadGrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg=new ThreadGroup("Lavi");
		Thread4 t1=new Thread4(tg,"datta");
Thread4 t=new Thread4();
t1.start();
t.start();

	}

}
class Thread4 extends Thread{
	Thread4(){
}
	Thread4(ThreadGroup tg,String name){
		super(tg,name);
		
	}
public void run() {
ThreadGroup tg=getThreadGroup();
	for(int i=0;i<=10;i++) {
		System.out.println(getName()+"\t"+tg.getName());
	}
}


}