package teng.thread.runnable;

class testRunnable implements Runnable{
	public testRunnable() {}
	public void run() {
		//Thread.currentThread()返回当前正在执行的线程对象的引用
		System.out.println("子任务ID："+Thread.currentThread().getId());
	}
}
public class myRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("主线程ID："+Thread.currentThread().getId());
        testRunnable runnable = new testRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
	}

}
