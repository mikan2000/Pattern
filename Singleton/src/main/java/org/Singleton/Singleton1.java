package org.Singleton;

/**
 * 饿汉式单例类
 *
 */
public class Singleton1 
{
	//私有化构造方法
	private Singleton1() {}
	
    private static final Singleton1 instance = new Singleton1();
    
    //静态工厂方法
    public static Singleton1 getInstance() {
    	return instance;
    }
}
