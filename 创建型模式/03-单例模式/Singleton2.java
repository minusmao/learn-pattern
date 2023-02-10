/**
 * 懒汉式（创建方式线程不安全），第一次调用时才创建对象
 */
public class Singleton2 {

    // 1、定义指向本身的属性
    private static Singleton2 instance;

    // 2、私有化构造函数
    private Singleton2() {}

    // 3、定义拿到属性对象的方法（此处判断并创建对象，线程不安全）
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void show() {
        System.out.println("Singleton2 show");
    }

}