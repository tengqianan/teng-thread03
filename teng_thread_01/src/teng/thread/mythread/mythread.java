package teng.thread.mythread;
class testThread extends Thread
{
	private static int num = 0;
	public testThread() {
		num++;
	}
	public void run() {
		System.out.println("主动创建的第"+num+"个线程");
	}
}
public class mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        testThread test = new testThread();
        test.start();
	}

}
