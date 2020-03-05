package thread;

public class Program {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Test t = new Test();
			Task1 t1 = new Task1(t);
			Task2 t2 = new Task2(t);
			t1.start();
			t2.start();


	}

}
