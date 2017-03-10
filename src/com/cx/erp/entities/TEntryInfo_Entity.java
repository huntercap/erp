package com.cx.erp.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/11.
 */
@Entity
@Table(name = "t_entry_info", schema = "person", catalog = "")
public class TEntryInfo_Entity {
    private Date beginworkDate;
    private Date entryDate;
    private Date registDate;
    private byte[] approvalDoc;
    private String approvalDocNo;
    private Integer id;

    @Basic
    @Column(name = "beginwork_date", nullable = true)
    public Date getBeginworkDate() {
        return beginworkDate;
    }

    public void setBeginworkDate(Date beginworkDate) {
        this.beginworkDate = beginworkDate;
    }

    @Basic
    @Column(name = "entry_date", nullable = true)
    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Basic
    @Column(name = "regist_date", nullable = true)
    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    @Basic
    @Column(name = "approval_doc", nullable = true)
    public byte[] getApprovalDoc() {
        return approvalDoc;
    }

    public void setApprovalDoc(byte[] approvalDoc) {
        this.approvalDoc = approvalDoc;
    }

    @Basic
    @Column(name = "approval_doc_no", nullable = true, length = 20)
    public String getApprovalDocNo() {
        return approvalDocNo;
    }

    public void setApprovalDocNo(String approvalDocNo) {
        this.approvalDocNo = approvalDocNo;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TEntryInfo_Entity that = (TEntryInfo_Entity) o;

        if (beginworkDate != null ? !beginworkDate.equals(that.beginworkDate) : that.beginworkDate != null)
            return false;
        if (entryDate != null ? !entryDate.equals(that.entryDate) : that.entryDate != null) return false;
        if (registDate != null ? !registDate.equals(that.registDate) : that.registDate != null) return false;
        if (!Arrays.equals(approvalDoc, that.approvalDoc)) return false;
        if (approvalDocNo != null ? !approvalDocNo.equals(that.approvalDocNo) : that.approvalDocNo != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = beginworkDate != null ? beginworkDate.hashCode() : 0;
        result = 31 * result + (entryDate != null ? entryDate.hashCode() : 0);
        result = 31 * result + (registDate != null ? registDate.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(approvalDoc);
        result = 31 * result + (approvalDocNo != null ? approvalDocNo.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
