package code;

public class Derived extends Base {

	public Derived() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Base returnBase() {
		
		Base base1 = new Base();
		Derived derived = new Derived();
		
		
		Base base = new Derived();
		return base;
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		
	}

}

class OuterClass{
	int x;
	class InnerClass{
		int y;
	}
}


