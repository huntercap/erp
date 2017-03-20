package com.cx.erp.action;

import com.cx.erp.service.EmployeeService;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.struts2.interceptor.RequestAware;


import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */
public class EmployeeAction extends ActionSupport implements RequestAware
{
    private static final long serialVersionUID = 1L;
    private Map<String,Object> request;
    Gson gson = new Gson();
    ActionContext ctx= ActionContext.getContext();
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

        //System.out.println(request.toString());
        //System.out.println(employeeService.toString());
        //this.request.put("employees",employeeService.getAll());
        System.out.println("list method");
        System.out.println(gson.toJson(employeeService.getAll()));
        ctx.put("json",gson.toJson(employeeService.getAll()));
        //System.out.println(net.sf.json.JSONArray.fromObject(employeeService.getAll()).size());
        return "list";
    }

}
