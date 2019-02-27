package com.ant.enumsingleton;

/**
 * @author Ant gxstax@163.com
 * @ClassName: EnumHolder
 * @Description: 枚举类型实现单例（编程的艺术）
 * @datetime 2018/11/23 15:16
 * @Version 1.0
 */
public enum EnumHolder {
    INSTANCE;

    private int i;
    private Student student;
    private EnumHolder() {
        Student stu = new Student();
        stu.setAge(28);
        stu.setName("Ant");
        this.i = 1;
        this.student = stu;
    }

    public static Student getStudent() {
        for(EnumHolder enumHolder :EnumHolder.values()){
            return enumHolder.student;
        }
        return null;
    }
}
