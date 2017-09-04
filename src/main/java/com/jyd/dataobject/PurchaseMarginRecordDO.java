package com.jyd.dataobject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PurchaseMarginRecordDO implements Serializable {
    private String marginNo;

    private String enId;

    private String orderNo;

    private String batchId;

    private String userId;

    private BigDecimal requireManualApplyMargin;

    private BigDecimal realApplyMargin;

    private Date realApplyDate;

    private Short dealStatus;

    private Short source;

    private String marginNoteHtmlPath;

    private String marginNotePdfPath;

    private Date startTime;

    private Date endTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getMarginNo() {
        return marginNo;
    }

    public void setMarginNo(String marginNo) {
        this.marginNo = marginNo == null ? null : marginNo.trim();
    }

    public String getEnId() {
        return enId;
    }

    public void setEnId(String enId) {
        this.enId = enId == null ? null : enId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getRequireManualApplyMargin() {
        return requireManualApplyMargin;
    }

    public void setRequireManualApplyMargin(BigDecimal requireManualApplyMargin) {
        this.requireManualApplyMargin = requireManualApplyMargin;
    }

    public BigDecimal getRealApplyMargin() {
        return realApplyMargin;
    }

    public void setRealApplyMargin(BigDecimal realApplyMargin) {
        this.realApplyMargin = realApplyMargin;
    }

    public Date getRealApplyDate() {
        return realApplyDate;
    }

    public void setRealApplyDate(Date realApplyDate) {
        this.realApplyDate = realApplyDate;
    }

    public Short getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(Short dealStatus) {
        this.dealStatus = dealStatus;
    }

    public Short getSource() {
        return source;
    }

    public void setSource(Short source) {
        this.source = source;
    }

    public String getMarginNoteHtmlPath() {
        return marginNoteHtmlPath;
    }

    public void setMarginNoteHtmlPath(String marginNoteHtmlPath) {
        this.marginNoteHtmlPath = marginNoteHtmlPath == null ? null : marginNoteHtmlPath.trim();
    }

    public String getMarginNotePdfPath() {
        return marginNotePdfPath;
    }

    public void setMarginNotePdfPath(String marginNotePdfPath) {
        this.marginNotePdfPath = marginNotePdfPath == null ? null : marginNotePdfPath.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PurchaseMarginRecordDO other = (PurchaseMarginRecordDO) that;
        return (this.getMarginNo() == null ? other.getMarginNo() == null : this.getMarginNo().equals(other.getMarginNo()))
            && (this.getEnId() == null ? other.getEnId() == null : this.getEnId().equals(other.getEnId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getBatchId() == null ? other.getBatchId() == null : this.getBatchId().equals(other.getBatchId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRequireManualApplyMargin() == null ? other.getRequireManualApplyMargin() == null : this.getRequireManualApplyMargin().equals(other.getRequireManualApplyMargin()))
            && (this.getRealApplyMargin() == null ? other.getRealApplyMargin() == null : this.getRealApplyMargin().equals(other.getRealApplyMargin()))
            && (this.getRealApplyDate() == null ? other.getRealApplyDate() == null : this.getRealApplyDate().equals(other.getRealApplyDate()))
            && (this.getDealStatus() == null ? other.getDealStatus() == null : this.getDealStatus().equals(other.getDealStatus()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getMarginNoteHtmlPath() == null ? other.getMarginNoteHtmlPath() == null : this.getMarginNoteHtmlPath().equals(other.getMarginNoteHtmlPath()))
            && (this.getMarginNotePdfPath() == null ? other.getMarginNotePdfPath() == null : this.getMarginNotePdfPath().equals(other.getMarginNotePdfPath()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMarginNo() == null) ? 0 : getMarginNo().hashCode());
        result = prime * result + ((getEnId() == null) ? 0 : getEnId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getBatchId() == null) ? 0 : getBatchId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRequireManualApplyMargin() == null) ? 0 : getRequireManualApplyMargin().hashCode());
        result = prime * result + ((getRealApplyMargin() == null) ? 0 : getRealApplyMargin().hashCode());
        result = prime * result + ((getRealApplyDate() == null) ? 0 : getRealApplyDate().hashCode());
        result = prime * result + ((getDealStatus() == null) ? 0 : getDealStatus().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getMarginNoteHtmlPath() == null) ? 0 : getMarginNoteHtmlPath().hashCode());
        result = prime * result + ((getMarginNotePdfPath() == null) ? 0 : getMarginNotePdfPath().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", marginNo=").append(marginNo);
        sb.append(", enId=").append(enId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", batchId=").append(batchId);
        sb.append(", userId=").append(userId);
        sb.append(", requireManualApplyMargin=").append(requireManualApplyMargin);
        sb.append(", realApplyMargin=").append(realApplyMargin);
        sb.append(", realApplyDate=").append(realApplyDate);
        sb.append(", dealStatus=").append(dealStatus);
        sb.append(", source=").append(source);
        sb.append(", marginNoteHtmlPath=").append(marginNoteHtmlPath);
        sb.append(", marginNotePdfPath=").append(marginNotePdfPath);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}