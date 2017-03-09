package com.cx.erp.entities;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/9.
 */
@Entity
@Table(name = "t_list_contract", schema = "person", catalog = "")
public class TListContract_Entity {
    private Integer id;
    private String contractType;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contract_type", nullable = false, length = 20)
    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TListContract_Entity that = (TListContract_Entity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (contractType != null ? !contractType.equals(that.contractType) : that.contractType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contractType != null ? contractType.hashCode() : 0);
        return result;
    }
}
