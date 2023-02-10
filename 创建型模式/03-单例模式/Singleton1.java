/**
 * 饿汉式，在类加载时就创建对象
 */
public class Singleton1 {

    // 1、定义指向本身的属性，且创建对象赋值
    private static Singleton1 instance = new Singleton1();

    // 2、私有化构造函数
    private Singleton1() {}

    // 3、定义拿到属性对象的方法
    public static Singleton1 getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("Singleton1 show");
    }

}