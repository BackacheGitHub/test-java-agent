package test;

public class App {
    /**
     * -javaagent:/Users/backache/workspace/project/my/test-java-agent/simple-agent/target/simple-agent-1.0-SNAPSHOT.jar=test.APP&hello
     */
    public static void main(String[] args) {
        System.out.println(String.format("class: %s, classLoader: %s", App.class.getName(), ClassLoader.getSystemClassLoader()));
        App.hello();

    }

    public static void hello() {
        System.out.println("hello world.");
    }

}
