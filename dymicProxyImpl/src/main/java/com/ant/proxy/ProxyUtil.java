package com.ant.proxy;

import com.ant.jdk.MyInvocationHandler;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: ProxyUtil
 * @Description: 动态代理工具类
 * @datetime 2018/11/5 11:50
 * @Version 1.0
 */
public class ProxyUtil {

    public static Object newInstance(Class targetInf, MyInvocationHandler handler) {
//        Object object = null;
//        Class target = targetInf.getClass().getInterfaces()[0];
        Method[] methods = targetInf.getDeclaredMethods();
        String targetDao = targetInf.getSimpleName();
        String targetDaoNam = targetInf.getName();

        String line = "\r";
        String tab = "\t";
        StringBuilder wholeSb = new StringBuilder();
        StringBuilder packageSb = new StringBuilder();
        StringBuilder importSb = new StringBuilder();
        StringBuilder classSb = new StringBuilder();
        StringBuilder constracSb = new StringBuilder();
        StringBuilder methodSb = new StringBuilder();

        packageSb.append("package com.google;").append(line);
        importSb.append("import ").append(targetDaoNam).append(";").append(line);
        importSb.append("import java.lang.reflect.Method;");
        classSb.append("public class $proxy implements ").append(targetDao)
                .append("{").append(line);
        constracSb.append(tab).append("public ").append(targetDao)
                .append(" targ;").append(line);
        constracSb.append(tab).append("public $proxy (").append(targetDao)
                .append(" targ ){").append(line);
        constracSb.append(tab).append(tab).append("this.targ = targ;").append(line);
        constracSb.append(tab).append("}").append(line);

        for (int i = 0; i < methods.length; i++) {
            String returnTypeNam = methods[i].getReturnType().getSimpleName();
            String methodNam = methods[i].getName();
            String argContent = "";
            String paramsContent = "";

            String methodTarget = targetInf.getName();
            Class args[] = methods[i].getParameterTypes();
            int j = 0;
            for (Class arg : args) {
                argContent+=arg.getSimpleName() + " p" +j + ",";
                paramsContent+= "p" + j + ",";
                j++;
            }
            if(j > 0) {
                argContent = argContent.substring(0,argContent.length()-1);
                paramsContent = paramsContent.substring(0,paramsContent.length()-1);
            }
            methodSb.append(tab).append("@Override").append(line);
            methodSb.append(tab).append("public ").append(returnTypeNam).append(" ")
                    .append(methodNam).append("(").append(argContent)
                    .append(") throws Exception {").append(line);
            methodSb.append(tab).append(tab)
                    .append("Method method = Class.forName(\"").append(methodTarget)
                    .append("\").getMethod(\"").append(methodNam).append("\");")
                    .append(line);
            if(returnTypeNam.equals("void")) {
                methodSb.append(tab).append(tab).append("targ.invoke(method);").append(line);
//                        .append("(").append(paramsContent).append(");").append(line);
                methodSb.append(tab).append("}").append(line);
            }else {
                methodSb.append(tab).append(tab).append("return targ.").append(methodNam)
                        .append("(").append(paramsContent).append(");").append(line);
                methodSb.append(tab).append("}").append(line);
            }

        }

        wholeSb.append(packageSb).append(importSb).append(classSb)
                .append(constracSb).append(methodSb);
        wholeSb.append("}");

        File file = new File("d:\\com\\google\\$proxy.java");

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(wholeSb.toString());
            fw.flush();
            fw.close();

            /**
             * 利用编译工具把java文件手动生成一个class文件，供后面实例对象用
             */
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null,null,null);
            Iterable units = fileMgr.getJavaFileObjects(file);
            JavaCompiler.CompilationTask t = compiler.getTask(null,fileMgr,null, null,null, units);
            t.call();
            fileMgr.close();

            /**
             * 利用反射自动生成一个代理类然后返回给调用对象
             */
            URL urls[] = new URL[] {new URL("file:D:\\\\")};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class clazz = urlClassLoader.loadClass("com.google.$proxy");
//            java.lang.reflect.Constructor constructor = clazz.getConstructor(target);
//            object = constructor.newInstance(targetInf);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
