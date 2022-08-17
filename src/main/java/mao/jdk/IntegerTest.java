package mao.jdk;

/**
 * Project name(项目名称)：java设计模式_享元模式
 * Package(包名): mao.jdk
 * Class(类名): IntegerTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 21:47
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class IntegerTest
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i1和i2对象是否是同一个对象？" + (i1 == i2));
        System.out.println("i3和i4对象是否是同一个对象？" + (i3 == i4));
    }
}
