package test;

/**
 * 一个包含静态方法块的类，测试agent中的类是否会被加载
 */
public class StaticClass {
    static {
        System.out.println(String.format("class: %s, classLoader: %s", StaticClass.class.getName(), ClassLoader.getSystemClassLoader()));
    }
}
