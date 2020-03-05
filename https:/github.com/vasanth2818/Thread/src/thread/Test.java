package thread;

public class Test {
	void print(int n)

	{
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
		}
	}
}
	 class Task1 extends Thread {
		Test k;

		public void run() {
			k.print(5);

		}

		Task1(Test a) {
			k = a;
		}
	}

	 class Task2 extends Thread {
		Test k;

		public void run() {
			k.print(10);
		}

		Task2(Test t) {
			k = t;
	}
	
		}

