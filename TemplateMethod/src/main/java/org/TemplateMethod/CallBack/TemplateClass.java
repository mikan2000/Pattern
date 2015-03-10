package org.TemplateMethod.CallBack;

public class TemplateClass {

	public Boolean templateMethod(TemplateInterface templateInterface) {
		
		System.out.println("templateMethod()开始");
		return templateInterface.callBackMethod();
	}
}
