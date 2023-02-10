/**
 * 懒汉式（创建方式线程安全，且并发性能高，采用静态内部类方式），第一次调用时才创建对象
 */
public class Singleton5 {

    // 1、定义静态内部类，且内部类的静态属性指向外部类，并创建对象赋值（只有在内部类被加载的时候才会创建对象赋值，且类加载是线程安全的）
    private static class SingletonHolder {  
        private static final Singleton5 INSTANCE = new Singleton5();  
    }

    // 2、私有化构造函数
    private Singleton5() {}

    // 3、定义拿到属性对象的方法（此处判断并创建对象，线程安全，且并发性能高，采用静态内部类方式）
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void show() {
        System.out.println("Singleton5 show");
    }

}