package org.FactoryMethod;

public class Factory {
	
	public Product createProduct(String name) {
		// TODO Auto-generated method stub
		try {
			return (Product)Class.forName(name).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
