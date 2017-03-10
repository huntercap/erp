package com.cx.erp.entities;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/11.
 */
@Entity
@Table(name = "t_list_state", schema = "person", catalog = "")
public class TListState_Entity {
    private Integer id;
    private String inOutWay;
    private String stateType;
    private byte[] approvalDoc;
    private String approvalDocNo;
    private String comment;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "in_out_way", nullable = false, length = 20)
    public String getInOutWay() {
        return inOutWay;
    }

    public void setInOutWay(String inOutWay) {
        this.inOutWay = inOutWay;
    }

    @Basic
    @Column(name = "state_type", nullable = false, length = 10)
    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
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

    @Basic
    @Column(name = "comment", nullable = true, length = 50)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TListState_Entity that = (TListState_Entity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (inOutWay != null ? !inOutWay.equals(that.inOutWay) : that.inOutWay != null) return false;
        if (stateType != null ? !stateType.equals(that.stateType) : that.stateType != null) return false;
        if (!Arrays.equals(approvalDoc, that.approvalDoc)) return false;
        if (approvalDocNo != null ? !approvalDocNo.equals(that.approvalDocNo) : that.approvalDocNo != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (inOutWay != null ? inOutWay.hashCode() : 0);
        result = 31 * result + (stateType != null ? stateType.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(approvalDoc);
        result = 31 * result + (approvalDocNo != null ? approvalDocNo.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
