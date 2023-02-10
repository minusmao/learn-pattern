/**
 * 文档处理类工厂的实现工厂（产品族：Good系列）
 */
public class GoodDocumentFactory implements AbstractDocumentFactory {

    // 创建Html文档处理对象
    @Override
    public HtmlDocument createHtml() {
        return new GoodHtmlDocument();
    }

    // 创建Word文档处理对象
    @Override
    public WordDocument createWord() {
        return new GoodWordDocument();
    }

}