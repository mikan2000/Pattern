package org.Singleton;

/**
 * 懒汉式单例类，线程安全使用双层锁
 *
 */
public class Singleton2 
{
	//私有化构造方法
	private Singleton2() {}
	
    private volatile static Singleton2 instance = null;
    
    //静态工厂方法
    public static Singleton2 getInstance() {
    	if (instance == null) {
    		synchronized (Singleton2.class) {
    			if (instance == null) {
    				instance = new Singleton2();
    			}
			}
    	}
    	return instance;
    }
}
