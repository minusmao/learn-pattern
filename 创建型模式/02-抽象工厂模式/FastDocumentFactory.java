/**
 * 文档处理类工厂的实现工厂（产品族：Fast系列）
 */
public class FastDocumentFactory implements AbstractDocumentFactory {

    // 创建Html文档处理对象
    @Override
    public HtmlDocument createHtml() {
        return new FastHtmlDocument();
    }

    // 创建Word文档处理对象
    @Override
    public WordDocument createWord() {
        return new FastWordDocument();
    }

}