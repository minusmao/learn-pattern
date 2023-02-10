/**
 * 抽象工厂模式
 * 菜鸟教程（例子有误）：https://www.runoob.com/design-pattern/abstract-factory-pattern.html
 * 廖雪峰教程：https://www.liaoxuefeng.com/wiki/1252599548343744/1281319134822433
 * 进击的java菜鸟：https://fhfirehuo.github.io/Attacking-Java-Rookie/Chapter04/AbstractFactory.html
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 用fast产品族处理文档
        AbstractDocumentFactory fastDocumentFactory = AbstractDocumentFactory.createFactory("fast");
        fastDocumentFactory.createHtml().dealHtml();
        fastDocumentFactory.createWord().dealWord();
        // 用good产品族处理文档
        AbstractDocumentFactory goodDocumentFactory = AbstractDocumentFactory.createFactory("good");
        goodDocumentFactory.createHtml().dealHtml();
        goodDocumentFactory.createWord().dealWord();
    }
}