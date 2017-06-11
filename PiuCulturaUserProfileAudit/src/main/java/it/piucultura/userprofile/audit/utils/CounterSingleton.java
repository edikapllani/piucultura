package it.piucultura.userprofile.audit.utils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by earthshrek on 08/06/2017.
 */
public class CounterSingleton {
    private AtomicInteger atomicInteger;

    private static CounterSingleton obj = null;

    private CounterSingleton(int initialValue){

        this.atomicInteger = new AtomicInteger(initialValue);
    }

    public static CounterSingleton getInstance(){
        if(obj == null){
            obj = new CounterSingleton(1);
        }
        return obj;
    }

    public int getCounter() {
        return atomicInteger.getAndIncrement();
    }
}
