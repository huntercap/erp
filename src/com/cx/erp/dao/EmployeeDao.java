package com.cx.erp.dao;

import com.cx.erp.entities.TEmployee_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/3/5.
 */
public class EmployeeDao extends BaseDao {

    public List<TEmployee_Entity> getAll(){
        String hql = "from TEmployee_Entity e left outer join FETCH e.nation left outer join FETCH e.contract";
        return getSession().createQuery(hql).list();
    }
}
