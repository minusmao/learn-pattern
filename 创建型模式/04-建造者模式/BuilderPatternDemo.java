/**
 * 建造者模式
 * 秒懂设计模式：https://zhuanlan.zhihu.com/p/58093669
 * 菜鸟教程：https://www.runoob.com/design-pattern/builder-pattern.html
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        // 使用构造器构建Computer对象
        Computer computer = new Computer.Builder("因特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
        System.out.println(computer.toString());
    }
}