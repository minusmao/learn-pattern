/**
 * 懒汉式（创建方式线程安全，且并发性能高，采用双重校验锁方式），第一次调用时才创建对象
 */
public class Singleton4 {

    // 1、定义指向本身的属性
    private static volatile Singleton4 instance;

    // 2、私有化构造函数
    private Singleton4() {}

    // 3、定义拿到属性对象的方法（此处判断并创建对象，线程安全，且并发性能高，采用双重校验锁方式）
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized(Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("Singleton4 show");
    }

}