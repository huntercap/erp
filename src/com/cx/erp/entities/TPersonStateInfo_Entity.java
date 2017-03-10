package com.cx.erp.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/11.
 */
@Entity
@Table(name = "t_person_state_info", schema = "person", catalog = "")
public class TPersonStateInfo_Entity {
    private Integer id;
    private Date startOn;
    private byte[] approvalDocForPer;
    private String approvalDocNo;
    private String comment;
    private String comeFrom;
    private TListState_Entity tListStateByFkStateId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "start_on", nullable = true)
    public Date getStartOn() {
        return startOn;
    }

    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    @Basic
    @Column(name = "approval_doc_for_per", nullable = true)
    public byte[] getApprovalDocForPer() {
        return approvalDocForPer;
    }

    public void setApprovalDocForPer(byte[] approvalDocForPer) {
        this.approvalDocForPer = approvalDocForPer;
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

    @Basic
    @Column(name = "come_from", nullable = true, length = 50)
    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPersonStateInfo_Entity that = (TPersonStateInfo_Entity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startOn != null ? !startOn.equals(that.startOn) : that.startOn != null) return false;
        if (!Arrays.equals(approvalDocForPer, that.approvalDocForPer)) return false;
        if (approvalDocNo != null ? !approvalDocNo.equals(that.approvalDocNo) : that.approvalDocNo != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (comeFrom != null ? !comeFrom.equals(that.comeFrom) : that.comeFrom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (startOn != null ? startOn.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(approvalDocForPer);
        result = 31 * result + (approvalDocNo != null ? approvalDocNo.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (comeFrom != null ? comeFrom.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_state_id", referencedColumnName = "id", nullable = false)
    public TListState_Entity gettListStateByFkStateId() {
        return tListStateByFkStateId;
    }

    public void settListStateByFkStateId(TListState_Entity tListStateByFkStateId) {
        this.tListStateByFkStateId = tListStateByFkStateId;
    }
}
