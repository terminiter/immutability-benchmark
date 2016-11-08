package testcase;

import annotations.MUTABLE;

public class AGT113_This_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT113_This_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = this;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT113_This_ThisInstanceVariable test = new AGT113_This_ThisInstanceVariable();
		test.foo();
	}

}