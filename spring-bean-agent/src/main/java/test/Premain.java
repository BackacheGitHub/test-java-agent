package test;

import java.lang.instrument.Instrumentation;

public class Premain {
    public static void premain(String agentOps, Instrumentation inst) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*
         * 不需要加载，java agent也在类路径当中，会被bootstrap classloader加载
         */
//        Class.forName("test.BeanController");
    }
}
