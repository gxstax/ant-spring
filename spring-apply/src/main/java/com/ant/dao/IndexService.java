package com.ant.dao;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: IndexService
 * @Description: TODO
 * @datetime 2018/11/18 14:04
 * @Version 1.0
 */
public class IndexService {

    private IndexDao dao;

    public IndexService (IndexDao dao){
        this.dao = dao;
    }

    public void service() {
        dao.query("s");
    }

//    public void setDao(IndexDao dao) {
//        this.dao = dao;
//    }
}
