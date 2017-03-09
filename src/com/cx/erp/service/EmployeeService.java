package com.cx.erp.service;

import com.cx.erp.dao.EmployeeDao;
import com.cx.erp.entities.TEmployee_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
public class EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        System.out.println("2:setEmployeeDao");
        this.employeeDao = employeeDao;
    }

    public List<TEmployee_Entity> getAll(){
        return employeeDao.getAll();
    }
}
