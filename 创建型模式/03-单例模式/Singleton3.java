/**
 * 懒汉式（创建方式线程安全，但并发性能低），第一次调用时才创建对象
 */
public class Singleton3 {

    // 1、定义指向本身的属性
    private static Singleton3 instance;

    // 2、私有化构造函数
    private Singleton3() {}

    // 3、定义拿到属性对象的方法（此处判断并创建对象，线程安全，但并发性能低）
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public void show() {
        System.out.println("Singleton3 show");
    }

}