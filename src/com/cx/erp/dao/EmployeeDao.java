package com.cx.erp.dao;

import com.cx.erp.entities.TEmployee_Entity;

import java.util.List;


public class EmployeeDao extends BaseDao {

    public List<TEmployee_Entity> getAll(){
        String hql = "from TEmployee_Entity e left outer join FETCH e.nation left outer join FETCH e.contract left outer join FETCH e.entryInfo";

                /*返回1545开始的100条记录
                return getSession()
                .createQuery(hql)
                .setFirstResult(1545)
                .setMaxResults(100)
                .list();*/

    return  getSession().createQuery(hql).list();
    }
}
