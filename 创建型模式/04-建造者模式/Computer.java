/**
 * 构造对象属性较多时，使用构造器实现
 */
public class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    // 私有化构造方法，且传参为构造器
    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.usbCount=builder.usbCount;
        this.keyboard=builder.keyboard;
        this.display=builder.display;
    }

    // 定义构造器
    public static class Builder{
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选

        public Builder(String cup,String ram){
            this.cpu=cup;
            this.ram=ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }        
        public Computer build(){
            return new Computer(this);
        }
    }

    // 省略getter方法

    // 重写toString()方法
    @Override
    public String toString() {
        return "cpu: " + cpu + "\n"
            + "ram: " + ram + "\n"
            + "usbCount: " + usbCount + "\n"
            + "keyboard: " + keyboard + "\n"
            + "display: " + display + "\n";
    }

}