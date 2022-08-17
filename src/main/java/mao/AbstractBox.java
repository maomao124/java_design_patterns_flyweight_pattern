package mao;

/**
 * Project name(项目名称)：java设计模式_享元模式
 * Package(包名): mao
 * Class(类名): AbstractBox
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 21:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public abstract class AbstractBox
{
    /**
     * 获得一个形状
     *
     * @return 形状
     */
    public abstract String getShape();

    /**
     * 显示
     *
     * @param color 颜色
     */
    public void display(String color)
    {
        System.out.println("方块形状：" + this.getShape() + "，颜色：" + color);
    }
}
