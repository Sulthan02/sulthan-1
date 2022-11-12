package looping;

public class Loopingproblem {

	public static void main(String[] args) {

		Loopingproblem loop = new Loopingproblem(); // object creation
		 loop.program();
		 loop.program2();

	}

	private void program2() {
		
		int no = 1;
		int result;
		while (no <= 5)
		{
			result = no * no * no;

			no = no+2;

			System.out.print(result + " ");

		}

	}

	private void program() {
		
		int no = 1;
		int result;
		while (no <= 4) {
			result = no * no * no;
			System.out.print(result + " ");
			no = no + 1;
		}
	}
}

