package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT028_CharLiteral_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT028_CharLiteral_ParameterArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object[] p){
		p[0] = '1';
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}