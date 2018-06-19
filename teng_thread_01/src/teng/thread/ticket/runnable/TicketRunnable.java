package teng.thread.ticket.runnable;

public class TicketRunnable implements Runnable{
	private int ticketCount = 10;
	Object mutex = new Object();//定义锁
	//卖票
	public void TicketRunnable() {
		/**
		 * 当操作是共享资源时，用同步代码块进行包围起来
		 * 执行里面的代码需要mutex的锁
		 * 但是mutex只有一个锁，这样执行时只能有一个线程执行同步代码块里面的内容
		 * */
		synchronized(mutex) {
			if(ticketCount > 0) {
				ticketCount--;
				System.out.println(Thread.currentThread().getName()+"还剩"+ticketCount+"张票");
			}else {
				System.out.println("票卖完了！");
				return;
			}
		}
	}
	public void run() {
		while(ticketCount > 0) {
			TicketRunnable();
			/**
			 * 线程睡眠1000毫秒
			 * 让其他线程可以得到锁，进行卖票
			 * */
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
