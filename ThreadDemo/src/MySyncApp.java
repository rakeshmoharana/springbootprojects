
public class MySyncApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("======================== Start ====================");
		
		Print print = new Print();
		MyThread t = new MyThread(print);
//		t.start();
		YourThread y = new YourThread(print);
		t.start();
		/*try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		y.start();
		

		System.out.println("======================== End ====================");
	}

}


class Print{
	 synchronized void printDoc(int numOfCopies, String docName) {
		for (int i=0; i<numOfCopies;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing "+docName+" "+i);
		}
	}
}

class MyThread extends Thread{
	Print p;
	public MyThread(Print p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.printDoc(10, " My John's Profile");
	}
}

class YourThread extends Thread{
	Print p;
	public YourThread(Print p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.printDoc(10, "John's Profile");
	}
}