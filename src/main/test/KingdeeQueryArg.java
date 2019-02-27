

import java.lang.reflect.Field;

/**
 * Created by huangzh on 2018/7/26.
 */
public class KingdeeQueryArg {
    private final static String FILTER_STR = " 1=1 ";

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getFieldKeys() {
        return fieldKeys;
    }

    public void setFieldKeys(String fieldKeys) {
        this.fieldKeys = fieldKeys;
    }

    public String getFilterString() {
        return filterString;
    }

    public void setFilterString(String filterString) {
        this.filterString = filterString;
    }

    public String getOrderString() {
        return orderString;
    }

    public void setOrderString(String orderString) {
        this.orderString = orderString;
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public String getStartRow() {
        return startRow;
    }

    public void setStartRow(String startRow) {
        this.startRow = startRow;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * 1.1.FormId：业务对象表单Id（必录）
     * 1.2.FieldKeys：字段keys，字符串类型用逗号分隔，比如"key1,key2..."（必录）
     * 1.3.FilterString：过滤（非必录）
     * 1.4.OrderString：排序字段（非必录）
     * 1.5.TopRowCount：总行数（非必录）
     * 1.6.StartRow：开始行（非必录）
     * 1.7.Limit：最大行数，不能超过2000（非必录）
     */

    private String formId;

    private String fieldKeys;

    private String filterString;

    private String orderString;

    private String rowCount;     //接口返回限制

    private String startRow;

    private String limit;       //数据库查询限制

    public KingdeeQueryArg(int objNum) {
        String classNam = ObjEnum.getObjNum(objNum);
        String fildKeys = "";
        try {
            StringBuilder fieldKeysSb = new StringBuilder();
            Class clazz = Class.forName(classNam);
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                fieldKeysSb.append(field.getName()).append(",");
            }
            fildKeys = fieldKeysSb.toString();
            if (fildKeys.length() > 0) {
                fildKeys = fildKeys.substring(0, fildKeys.length() - 1);
            }
        }catch (ClassNotFoundException e){

        }
        this.fieldKeys = fildKeys;
        this.filterString = FILTER_STR;
    }
}
