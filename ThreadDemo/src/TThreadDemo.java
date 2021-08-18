
public class TThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r1 = new ThreadClass1();
Thread t1 = new Thread(r1);



Runnable r2 = new ThreadClass2();
Thread t2 = new Thread(r2);
t2.start();
t1.start();
	}

}
