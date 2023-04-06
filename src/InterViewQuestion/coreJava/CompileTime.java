package InterViewQuestion.coreJava;

class BaseService {
}

class ChildService extends BaseService {
}

class Base {
	public int data = 20;

	public void display(BaseService service) {
		System.out.println("In Base");
	}
}

class Child extends Base {
	
	public int data = 10;

	public void display(ChildService service) {
		System.out.println("In Child");
	}
}

public class CompileTime {
	public static void main(String[] args) {

		Base base = new Child();
		System.out.println(base.data); // 10
		base.display(new ChildService()); // In Child
		Child child = new Child();
		System.out.println(child.data); // 10
		child.display(new BaseService()); // in Base
		
	}
}