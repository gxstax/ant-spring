

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: ObjEnum
 * @Description: 对象枚举类
 * @datetime 2018/11/29 15:05
 * @Version 1.0
 */
public enum ObjEnum {
    EMPLOYEE(1, KingdeeEmpRst.class.getName()),
    DEPARTMENT(2, KingdeeDeptRst.class.getName()),
    PRODUCT(3, KingdeeProdRst.class.getName());

    private int objNum;
    private String objRstClassNam;

    private ObjEnum(int objNum, String objRstClassNam) {
        this.objNum = objNum;
        this.objRstClassNam = objRstClassNam;
    }


    /**
     * 获取对应编号的类名className
     * @param objNum
     * @return
     */
    public static String getObjNum(int objNum) {
        String className = "";
        ObjEnum[] objEnums = ObjEnum.values();
        for (ObjEnum objEnum:objEnums) {
            if(objEnum.objNum == objNum) {
                className = objEnum.objRstClassNam;
            }
        }
        return className;
    }

}
