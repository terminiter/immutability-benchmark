package testcase;

import annotations.READONLY;

public class AGT197_StaticDispatchReturn_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT197_StaticDispatchReturn_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT197_StaticDispatchReturn_Parameter test = new AGT197_StaticDispatchReturn_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = bar();
	}

	public static Object bar(){
		return new Object();
	}
	
}