package main.java.com.ant.test;

import com.ant.dao.IndexDao;
import com.ant.dao.IndexDaoImpl;
import com.ant.util.MyInvocationHandler;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: ProxyTest
 * @Description: TODO
 * @datetime 2018/11/6 16:12
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        IndexDaoImpl dao = new IndexDaoImpl();
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler indexHandler = new MyInvocationHandler<IndexDaoImpl>(dao);
        //创建一个代理对象stuProxy，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        IndexDao daoProxy = (IndexDao) Proxy.newProxyInstance(IndexDao.class.getClassLoader(), new Class<?>[]{IndexDao.class}, indexHandler);


        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", dao.getClass().getInterfaces());
        String path = "d:/com/google/IndexProxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            System.out.println("写文件错误");
        }

        daoProxy.proxy();
    }
}
