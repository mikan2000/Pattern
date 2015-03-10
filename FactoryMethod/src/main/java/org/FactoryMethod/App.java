package org.FactoryMethod;

public class App 
{
    public static void main( String[] args )
    {
        Product product = new Factory().createProduct("org.FactoryMethod.ConcreteProduct");
    }
}
