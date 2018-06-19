package teng.thread.ticket.runnable;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketRunnable ticket = new TicketRunnable();
		Thread thread1 = new Thread(ticket,"窗口1");//每个线程等待其他线程释放锁后才能执行
		Thread thread2 = new Thread(ticket,"窗口2");
		Thread thread3 = new Thread(ticket,"窗口3");
		Thread thread4 = new Thread(ticket,"窗口4");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
