package testcase;

import annotations.READONLY;

public class AGT155_ThisInstanceVariable_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public Object f = new Object();
	
	public static void main(String[] args) {
		new AGT155_ThisInstanceVariable_ClassVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		Test.f = this.f;
		System.out.println(test);
	}

}

class Test {
	public static Object f = new Object();

	@Override
	public String toString() {
		// updates to static fields to do not mutate a particular instance
		// instead it is considered a mutation to global program state
		return "Test []";
	}
}