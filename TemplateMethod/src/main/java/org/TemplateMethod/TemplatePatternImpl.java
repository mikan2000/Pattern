package org.TemplateMethod;

public class TemplatePatternImpl extends TemplatePattern {

	@Override
	public void method2() {
		System.out.println("子类中覆盖了method2()方法");
	}
	
	@Override
	protected void method3() {
		System.out.println("子类中具体实现method3()方法");
	}

}
