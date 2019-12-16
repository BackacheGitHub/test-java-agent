package test;

import java.lang.instrument.Instrumentation;

public class MyPremain {
    public static void premain(String agentOps, Instrumentation inst) {
        System.out.println("premain");
        System.out.println(String.format("class: %s, classLoader: %s", MyPremain.class.getName(), ClassLoader.getSystemClassLoader()));
    }
}
