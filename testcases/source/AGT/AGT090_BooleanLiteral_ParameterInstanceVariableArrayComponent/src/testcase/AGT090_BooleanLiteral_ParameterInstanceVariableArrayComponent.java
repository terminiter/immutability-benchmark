package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT090_BooleanLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT090_BooleanLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT090_BooleanLiteral_ParameterInstanceVariableArrayComponent test = new AGT090_BooleanLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT090_BooleanLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = true;
	}

}
