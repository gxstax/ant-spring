package com.ant.proxy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: ProxyUtil
 * @Description: TODO
 * @datetime 2018/11/5 11:50
 * @Version 1.0
 */
public class ProxyUtil {
    public static void main(String[] args) {
        StringBuilder packageSb = new StringBuilder();
        StringBuilder importSb = new StringBuilder();
        StringBuilder classSb = new StringBuilder();
        StringBuilder constracSb = new StringBuilder();
        StringBuilder methodSb = new StringBuilder();

    }

    public static Object instance(Class target) {
        Method[] methods = target.getDeclaredMethods();
        String targetDao = target.getSimpleName();

        String line = "\r";
        String tab = "\t";
        StringBuilder wholeSb = new StringBuilder();
        StringBuilder packageSb = new StringBuilder();
        StringBuilder importSb = new StringBuilder();
        StringBuilder classSb = new StringBuilder();
        StringBuilder constracSb = new StringBuilder();
        StringBuilder methodSb = new StringBuilder();

        packageSb.append("package com.ant.google;").append(line);
        importSb.append("import com.ant.dao.UserDao;").append(line);
        classSb.append("public class $proxy implements ").append(targetDao)
                .append("{").append(line);
        constracSb.append("public ").append(targetDao)
                .append("targ").append(line);
        constracSb.append("public $proxy (").append(targetDao)
                .append(" targ ){").append(line);
        constracSb.append(tab).append(tab).append("this.targ = targ;").append(line);
        constracSb.append(tab).append("}").append(line);

        for (int i = 0; i < methods.length; i++) {
            String returnTypeNam = methods[i].getReturnType().getName();
            String methodNam = methods[i].getName();
            String argContent = "";
            Object args[] = methods[i].getParameterTypes();
            int j = 0;
            for (Object arg : args) {
                argContent+=arg.getClass().getSimpleName() + " p " +j + ",";
                j++;
            }
            if(j > 0) {
                argContent.substring(0,argContent.length()-1);
            }
            methodSb.append(tab).append("@Override").append(line);
            methodSb.append(tab).append("public ").append(returnTypeNam)
                    .append(methodNam).append("(").append(argContent)
                    .append("){").append(line);
            methodSb.append(tab).append(tab)
                    .append("system.out.println(\"---- LOG -------\");")
                    .append(line);
            methodSb.append(tab).append(tab).append("targ.").append(methodNam)
                    .append("(").append(argContent).append(")").append(line);
            methodSb.append(tab).append(tab).append("}");

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
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
