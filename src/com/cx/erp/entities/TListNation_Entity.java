package com.cx.erp.entities;

/**
 * Created by Administrator on 2017/3/9.
 */

public class TListNation_Entity {
    private String nation;
    private Integer id;
    private String nationNo;


    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNationNo() {
        return nationNo;
    }

    public void setNationNo(String nationNo) {
        this.nationNo = nationNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TListNation_Entity that = (TListNation_Entity) o;

        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nationNo != null ? !nationNo.equals(that.nationNo) : that.nationNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nation != null ? nation.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (nationNo != null ? nationNo.hashCode() : 0);
        return result;
    }
}
