package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT034_ShortLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT034_ShortLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = (short) 1;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT034_ShortLiteral_ThisInstanceVariableArrayComponent test = new AGT034_ShortLiteral_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
