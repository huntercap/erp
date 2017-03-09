package com.cx.erp.action;

import com.cx.erp.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */
public class EmployeeAction extends ActionSupport implements RequestAware
{
    private static final long serialVersionUID = 1L;
    private Map<String,Object> request;
    @Override
    public void setRequest(Map<String, Object> request) {
        System.out.println("set request!");
        this.request = request;
    }

    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService e) {
        System.out.println("3:setEmployeeService");
        this.employeeService = e;
    }

    public String list(){

        System.out.println(request.toString());
        //System.out.println(employeeService.toString());
        this.request.put("employees",employeeService.getAll());
        return "list";
    }

}
