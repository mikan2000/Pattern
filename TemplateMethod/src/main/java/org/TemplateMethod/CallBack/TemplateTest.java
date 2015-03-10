package org.TemplateMethod.CallBack;

public class TemplateTest {

	public static void main(String[] args) {
		
		new TemplateClass().templateMethod(
				new TemplateInterface() {
					
					public Boolean callBackMethod() {
						System.out.println("执行回调callBackMethod");
						return Boolean.TRUE;
					}
				});
	}
}
