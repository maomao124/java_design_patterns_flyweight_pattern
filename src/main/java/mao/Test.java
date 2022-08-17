package mao;

/**
 * Project name(项目名称)：java设计模式_享元模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 21:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        BoxFactory boxFactory = BoxFactory.getInstance();

        System.out.println(boxFactory.getBox("L"));
        System.out.println(boxFactory.getBox("L"));
        System.out.println(boxFactory.getBox("L"));
        boxFactory.getBox("L").display("绿色");

        System.out.println(boxFactory.getBox("O"));
        System.out.println(boxFactory.getBox("O"));
        System.out.println(boxFactory.getBox("O"));
        boxFactory.getBox("O").display("绿色");

        System.out.println(boxFactory.getBox("I"));
        System.out.println(boxFactory.getBox("I"));
        System.out.println(boxFactory.getBox("I"));
        boxFactory.getBox("I").display("绿色");

        System.out.println(boxFactory.getBox("L"));
    }


}
