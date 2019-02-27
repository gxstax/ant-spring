

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: KingdeeEmpRst
 * @Description: 金蝶员工信息结果集
 * @datetime 2018/11/28 11:25
 * @Version 1.0
 */

public class KingdeeEmpRst {

    private String FName;//员工姓名


    private String FStaffNumber;//员工编号


    private String FTel;//电话


    private String FMobile;//手机号


    private String FPostDept;//所属部门

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getFStaffNumber() {
        return FStaffNumber;
    }

    public void setFStaffNumber(String FStaffNumber) {
        this.FStaffNumber = FStaffNumber;
    }

    public String getFTel() {
        return FTel;
    }

    public void setFTel(String FTel) {
        this.FTel = FTel;
    }

    public String getFMobile() {
        return FMobile;
    }

    public void setFMobile(String FMobile) {
        this.FMobile = FMobile;
    }

    public String getFPostDept() {
        return FPostDept;
    }

    public void setFPostDept(String FPostDept) {
        this.FPostDept = FPostDept;
    }

    public String getFEmail() {
        return FEmail;
    }

    public void setFEmail(String FEmail) {
        this.FEmail = FEmail;
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

    private String FEmail;//电子邮箱


    private String FModifyDate;//修改日期


    private String FCreateDate;//创建日期

}
