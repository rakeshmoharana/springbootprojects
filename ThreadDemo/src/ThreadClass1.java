
public class ThreadClass1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
for(int i = 0; i< 10;i++) {
	System.out.println("Thread ---- 1 ----- count "+i);
}
		
	}

}
