
/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: KingdeeDeptRst
 * @Description: 金蝶部门信息结果集
 * @datetime 2018/11/28 19:13
 * @Version 1.0
 */

public class KingdeeDeptRst {
    private String FNumber;//编码

    private String FName;//部门名称

    public String getFNumber() {
        return FNumber;
    }

    public void setFNumber(String FNumber) {
        this.FNumber = FNumber;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getFParentID() {
        return FParentID;
    }

    public void setFParentID(String FParentID) {
        this.FParentID = FParentID;
    }

    public String getFFullName() {
        return FFullName;
    }

    public void setFFullName(String FFullName) {
        this.FFullName = FFullName;
    }

    public String getFIsRoot() {
        return FIsRoot;
    }

    public void setFIsRoot(String FIsRoot) {
        this.FIsRoot = FIsRoot;
    }

    public String getFModifyDate() {
        return FModifyDate;
    }

    public void setFModifyDate(String FModifyDate) {
        this.FModifyDate = FModifyDate;
    }

    public String getFCreateDate() {
        return FCreateDate;
    }

    public void setFCreateDate(String FCreateDate) {
        this.FCreateDate = FCreateDate;
    }

    private String FParentID;//上级部门

    private String FFullName;//部门全称

    private String FIsRoot;//是否根节点

    private String FModifyDate;//修改日期

    private String FCreateDate;//创建日期
}
