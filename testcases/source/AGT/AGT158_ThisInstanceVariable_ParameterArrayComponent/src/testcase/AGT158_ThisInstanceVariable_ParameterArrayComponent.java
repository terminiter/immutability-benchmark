package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT158_ThisInstanceVariable_ParameterArrayComponent {
	
	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };

	@READONLY
	public Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT158_ThisInstanceVariable_ParameterArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT158_ThisInstanceVariable_ParameterArrayComponent a = new AGT158_ThisInstanceVariable_ParameterArrayComponent ();
		System.out.println(a);
		a.foo(a.f1);
		System.out.println(a);
	}
	
	public void foo(Object[] p){
		p[0] = this.f1;
	}

}