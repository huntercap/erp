package com.cx.erp.entities;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/11.
 */
@Entity
@Table(name = "t_list_formation_type", schema = "person", catalog = "")
public class TListFormationType_Entity {
    private Integer id;
    private String formationType;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "formation_type", nullable = true, length = 10)
    public String getFormationType() {
        return formationType;
    }

    public void setFormationType(String formationType) {
        this.formationType = formationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TListFormationType_Entity that = (TListFormationType_Entity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (formationType != null ? !formationType.equals(that.formationType) : that.formationType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (formationType != null ? formationType.hashCode() : 0);
        return result;
    }
}
