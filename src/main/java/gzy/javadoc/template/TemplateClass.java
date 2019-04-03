package gzy.javadoc.template;

/**
 * Javadoc 注释模板类
 * 
 * <pre>
 *     包含类、字段、方法的Javadoc注释模板
 * </pre>
 * 
 * @author GuoZhiYong 
 * @version 1.0
 * 可选：@param
 * 可选：@see
 * @since 2019-04-03 18:56:17
 * 可选：@serial
 * 可选：@deprecated
 *
 */
public class TemplateClass {

    /**
     * field simple description.
     *
     * field detailed description.
     *
     * 可选：@see
     * 可选：@since
     * 可选：@serialField | @serial
     * 可选：@deprecated
     */
    private Object templateField = new Object();

    /**
     * method simple description.
     *
     * method detailed description.
     *
     * 可选：@author
     * @param a 第一个加数
     * @param b 第二个加数
     * @return 返回a和b的和
     * 可选：@throws
     * 可选：@exception
     * 可选：@see
     * 可选：@since
     * 可选：@serialData
     * 可选：@deprecated
     */
    public int add(int a, int b) {
        return a + b;
    }

}
