package testcase;

import annotations.MUTABLE;

public class AGT053_LongLiteral_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT053_LongLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = 1L;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT053_LongLiteral_ThisInstanceVariable test = new AGT053_LongLiteral_ThisInstanceVariable();
		test.foo();
	}

}