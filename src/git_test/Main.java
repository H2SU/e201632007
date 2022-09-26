package git_test;

public class Main {

	static void say(){
		System.out.println("main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		say();
		Hello hello = new Hello();
		hello.say("hello world");
	}

}
