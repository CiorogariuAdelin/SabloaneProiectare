package Lab6;

public class Main {
	public static void main(String[] args) throws Exception {
		command cmd1 = new OpenCommand();
		cmd1.execute();
		command cmd2 = new StatisticsCommand();
		cmd2.execute();
		System.out.println("\nThe book: ");
		DocumentManager.getBook().pint();
	}
}