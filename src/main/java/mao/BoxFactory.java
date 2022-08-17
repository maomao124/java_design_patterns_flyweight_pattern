package mao;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Project name(项目名称)：java设计模式_享元模式
 * Package(包名): mao
 * Class(类名): BoxFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 21:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class BoxFactory
{
    private static volatile BoxFactory boxFactory;

    private static Map<String, AbstractBox> map;


    /**
     * Instantiates a new Box factory.
     */
    public BoxFactory()
    {
        map = new ConcurrentHashMap<>();
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static BoxFactory getInstance()
    {
        if (boxFactory == null)
        {
            synchronized (BoxFactory.class)
            {
                if (boxFactory == null)
                {
                    boxFactory = new BoxFactory();
                }
            }
        }
        return boxFactory;
    }

    /**
     * 获取Box
     *
     * @param key String
     * @return AbstractBox box
     */
    public AbstractBox getBox(String key)
    {
        if (key == null)
        {
            return null;
        }
        if (key.equals("I"))
        {
            return IBox(key);
        }
        if (key.equals("L"))
        {
            return LBox(key);
        }
        if (key.equals("O"))
        {
            return OBox(key);
        }
        return null;
    }

    /**
     * Box abstract box.
     *
     * @param key the key
     * @return the abstract box
     */
    private AbstractBox IBox(String key)
    {
        AbstractBox abstractBox = map.get(key);
        if (abstractBox == null)
        {
            IBox iBox = new IBox();
            map.put("I", iBox);
            return iBox;
        }
        return abstractBox;
    }

    /**
     * L box abstract box.
     *
     * @param key the key
     * @return the abstract box
     */
    private AbstractBox LBox(String key)
    {
        AbstractBox abstractBox = map.get(key);
        if (abstractBox == null)
        {
            LBox lBox = new LBox();
            map.put("L", lBox);
            return lBox;
        }
        return abstractBox;
    }

    /**
     * O box abstract box.
     *
     * @param key the key
     * @return the abstract box
     */
    private AbstractBox OBox(String key)
    {
        AbstractBox abstractBox = map.get(key);
        if (abstractBox == null)
        {
            OBox oBox = new OBox();
            map.put("O", oBox);
            return oBox;
        }
        return abstractBox;
    }

}
