package com.pxy.proxyspring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Sales {
    void sale();
}

class IBM implements Sales{

    @Override
    public void sale() {
        System.out.println("卖电脑");
    }
}

class IBMPlus implements InvocationHandler{
    private Sales sales;
    public IBMPlus(Sales sales){
        this.sales=sales;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("包送东西");
//        method.invoke(proxy,args);
        sales.sale();
        return null;
    }
}
public class ProxyTest{
    public static void main(String[] args) {
        Sales s = (Sales) Proxy.newProxyInstance(Sales.class.getClassLoader()
                , new Class[]{Sales.class}, new IBMPlus(new IBM()));
        s.sale();

    }
}
