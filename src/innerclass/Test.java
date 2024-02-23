package innerclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.show();
	}

}
