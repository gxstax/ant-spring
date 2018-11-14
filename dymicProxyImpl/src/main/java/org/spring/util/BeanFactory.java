package org.spring.util;

import com.ant.dao.UserDaoImpl;
import com.sun.xml.internal.ws.util.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: BeanFactory
 * @Description: 模拟Spring,手写BeanFactory实现
 * @datetime 2018/11/12 8:15
 * @Version 1.0
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    public BeanFactory(String xmlStr) {
        parselXML(xmlStr);
    }

    public void parselXML(String xml){
        try {
            /**
             * 读取xml获取xml内容文档
             */
            Document document = parse(xml);
            /**
             * 得到根节点，从根节点开始遍历
             */
            Element root = document.getRootElement();
            //初始化beanMap
//            Map<String, Object> beanMap = new HashMap<>();

            for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
                Element topElement = it.next();
                Attribute attribute = topElement.attribute("id");
                String beanName = attribute.getValue();
                Attribute classAtt = topElement.attribute("class");
                String className = classAtt.getValue();
                Class clazz = Class.forName(className);

                /**
                 * 维护bean之间的依赖关系（Spring xml 的get\set方法）
                 * 判断这个对象是否有依赖(property),或者是否有属性值
                 * 有则注入
                 */
                Object clazzObj = null;
                for (Iterator<Element> itele = topElement.elementIterator(); itele.hasNext();) {
                    Element childElement = itele.next();
                    if (childElement.getName().equals("property")) {
                        clazzObj = clazz.newInstance();
                        Attribute refAtt = childElement.attribute("ref");
                        String refAttNam = refAtt.getValue();
                        Attribute nameAtt = childElement.attribute("name");
                        String nameAttNam = nameAtt.getValue();
                        Object targetObj = beanMap.get(refAttNam);
                        Field fields = clazzObj.getClass().getDeclaredField(nameAttNam);
                        fields.set(clazzObj, targetObj);
                    }else if(childElement.getName().equals("constructor-arg")){
                        Attribute refAtt = childElement.attribute("ref");
                        String refAttNam = refAtt.getValue();
                        Object targetObj = beanMap.get(refAttNam);
                        Class injectObjClazz = targetObj.getClass();
                        Class cls = injectObjClazz.getInterfaces()[0];
                        Constructor con = clazz.getConstructor(cls);
                        con.setAccessible(true);
                        clazzObj = con.newInstance(targetObj);
                    }
                }

                /**
                 * 如果没有子标签
                 */
                if (null == clazzObj){
                    clazzObj = clazz.newInstance();
                }

                beanMap.put(beanName, clazzObj);
            }
            System.out.println(beanMap);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Document parse(String xml) throws DocumentException {
        File file = new File(this.getClass().getResource("/").getPath() + "/" + xml);
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        return document;
    }

    /**
     *
     * @param beanName
     * @return
     */
    public Object getBean(String beanName) {
        return this.beanMap.get(beanName);
    }

}
