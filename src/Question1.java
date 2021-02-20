
public class Question1 {
	void process() {
		System.out.println("This is Parent Class");
	}
}
	class child extends Question1{
		void process1() {
			System.out.println("This is Child Class");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 main = new Question1();
		
		child second = new child();
		
		main.process();
		second.process1();
		second.process();

	}

}
