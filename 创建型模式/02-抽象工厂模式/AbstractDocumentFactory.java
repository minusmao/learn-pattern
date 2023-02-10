/**
 * 文档处理类工厂的抽象工厂
 * 产品等级（按产品分类，如Html、Word产品）：HtmlDocument、WordDocument
 * 产品族（产品组合成一个系列，如Fast、Good系列）：FastDocumentFactory、GoodDocumentFactory
 */
public interface AbstractDocumentFactory {

    // 创建Html文档处理对象
    public HtmlDocument createHtml();

    // 创建Word文档处理对象
    public WordDocument createWord();

    // 创建具体文档处理类工厂（传入产品族名字：fast、good）
    public static AbstractDocumentFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastDocumentFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodDocumentFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }

}