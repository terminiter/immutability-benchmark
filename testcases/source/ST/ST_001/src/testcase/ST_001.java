package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class ST_001 {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new ST_001().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object[]{ new Object() } };
	
	public void bar(Test p){
		p.f = (Object[]) f[0];
	}

	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}