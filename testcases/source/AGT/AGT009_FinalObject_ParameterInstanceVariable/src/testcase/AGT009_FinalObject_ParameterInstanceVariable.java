package testcase;

import annotations.MUTABLE;

public class AGT009_FinalObject_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT009_FinalObject_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Test p){
		final Object o = new Object();
		p.f = o;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}