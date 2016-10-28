package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT084_BooleanLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT084_BooleanLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = true;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT084_BooleanLiteral_ThisInstanceVariableArrayComponent test = new AGT084_BooleanLiteral_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
