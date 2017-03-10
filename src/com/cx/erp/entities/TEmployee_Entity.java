package com.cx.erp.entities;

import java.util.Date;


/**
 * Created by Administrator on 2017/3/5.
 */

public class TEmployee_Entity {
    private Integer id;
    private String jobNo;
    private Integer salaryId;
    private String fullName;
    private String idNo;
    private Date birthDate;
    private String endowmentNo;
    private String gender;

    private TListNation_Entity nation;
    private TListContract_Entity contract;
    private TEntryInfo_Entity entryInfo;

    public TEntryInfo_Entity getEntryInfo() {
        return entryInfo;
    }

    public void setEntryInfo(TEntryInfo_Entity entryInfo) {
        this.entryInfo = entryInfo;
    }

    public TListContract_Entity getContract() {
        return contract;
    }

    public void setContract(TListContract_Entity contract) {
        this.contract = contract;
    }

    public TListNation_Entity getNation() {
        return nation;
    }

    public void setNation(TListNation_Entity nation) {
        this.nation = nation;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }


    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }



    public String getEndowmentNo() {
        return endowmentNo;
    }

    public void setEndowmentNo(String endowmentNo) {
        this.endowmentNo = endowmentNo;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TEmployee_Entity that = (TEmployee_Entity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (jobNo != null ? !jobNo.equals(that.jobNo) : that.jobNo != null) return false;
        if (salaryId != null ? !salaryId.equals(that.salaryId) : that.salaryId != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (idNo != null ? !idNo.equals(that.idNo) : that.idNo != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (endowmentNo != null ? !endowmentNo.equals(that.endowmentNo) : that.endowmentNo != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (jobNo != null ? jobNo.hashCode() : 0);
        result = 31 * result + (salaryId != null ? salaryId.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (idNo != null ? idNo.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (endowmentNo != null ? endowmentNo.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
