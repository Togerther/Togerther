package com.example.mybatisplugdemo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "apply_flow")
public class ApplyInterfaceFlow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 申请编号
     */
    @Column(name = "apply_no")
    private String applyNo;

    @Column(name = "flow_code")
    private String flowCode;

    /**
     * 审批人
     */
    @Column(name = "approve_name")
    private String approveName;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 节点编码
     */
    @Column(name = "node_code")
    private String nodeCode;

    /**
     * 审核状态（0表示驳回，1表示通过）
     */
    @Column(name = "approve_status")
    private Integer approveStatus;

    /**
     * 审批意见
     */
    @Column(name = "approve_desc")
    private String approveDesc;

    /**
     * 当前流程是否已经结束关闭 (0表示关闭，1表示活跃）
     */
    @Column(name = "close_mark")
    private Integer closeMark;

    /**
     * 是否是起始节点0否1是
     */
    @Column(name = "start_mark")
    private Integer startMark;

    /**
     * 当前节点之集，节点之间&拼接
     */
    @Column(name = "parent_codes")
    private String parentCodes;

    /**
     * 节点级数
     */
    @Column(name = "node_level")
    private Integer nodeLevel;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间，也可以理解为最后一个人的审批时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取申请编号
     *
     * @return apply_no - 申请编号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置申请编号
     *
     * @param applyNo 申请编号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    /**
     * @return flow_code
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * @param flowCode
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode == null ? null : flowCode.trim();
    }

    /**
     * 获取审批人
     *
     * @return approve_name - 审批人
     */
    public String getApproveName() {
        return approveName;
    }

    /**
     * 设置审批人
     *
     * @param approveName 审批人
     */
    public void setApproveName(String approveName) {
        this.approveName = approveName == null ? null : approveName.trim();
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取节点编码
     *
     * @return node_code - 节点编码
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * 设置节点编码
     *
     * @param nodeCode 节点编码
     */
    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode == null ? null : nodeCode.trim();
    }

    /**
     * 获取审核状态（0表示驳回，1表示通过）
     *
     * @return approve_status - 审核状态（0表示驳回，1表示通过）
     */
    public Integer getApproveStatus() {
        return approveStatus;
    }

    /**
     * 设置审核状态（0表示驳回，1表示通过）
     *
     * @param approveStatus 审核状态（0表示驳回，1表示通过）
     */
    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    /**
     * 获取审批意见
     *
     * @return approve_desc - 审批意见
     */
    public String getApproveDesc() {
        return approveDesc;
    }

    /**
     * 设置审批意见
     *
     * @param approveDesc 审批意见
     */
    public void setApproveDesc(String approveDesc) {
        this.approveDesc = approveDesc == null ? null : approveDesc.trim();
    }

    /**
     * 获取当前流程是否已经结束关闭 (0表示关闭，1表示活跃）
     *
     * @return close_mark - 当前流程是否已经结束关闭 (0表示关闭，1表示活跃）
     */
    public Integer getCloseMark() {
        return closeMark;
    }

    /**
     * 设置当前流程是否已经结束关闭 (0表示关闭，1表示活跃）
     *
     * @param closeMark 当前流程是否已经结束关闭 (0表示关闭，1表示活跃）
     */
    public void setCloseMark(Integer closeMark) {
        this.closeMark = closeMark;
    }

    /**
     * 获取是否是起始节点0否1是
     *
     * @return start_mark - 是否是起始节点0否1是
     */
    public Integer getStartMark() {
        return startMark;
    }

    /**
     * 设置是否是起始节点0否1是
     *
     * @param startMark 是否是起始节点0否1是
     */
    public void setStartMark(Integer startMark) {
        this.startMark = startMark;
    }

    /**
     * 获取当前节点之集，节点之间&拼接
     *
     * @return parent_codes - 当前节点之集，节点之间&拼接
     */
    public String getParentCodes() {
        return parentCodes;
    }

    /**
     * 设置当前节点之集，节点之间&拼接
     *
     * @param parentCodes 当前节点之集，节点之间&拼接
     */
    public void setParentCodes(String parentCodes) {
        this.parentCodes = parentCodes == null ? null : parentCodes.trim();
    }

    /**
     * 获取节点级数
     *
     * @return node_level - 节点级数
     */
    public Integer getNodeLevel() {
        return nodeLevel;
    }

    /**
     * 设置节点级数
     *
     * @param nodeLevel 节点级数
     */
    public void setNodeLevel(Integer nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间，也可以理解为最后一个人的审批时间
     *
     * @return update_time - 更新时间，也可以理解为最后一个人的审批时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间，也可以理解为最后一个人的审批时间
     *
     * @param updateTime 更新时间，也可以理解为最后一个人的审批时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}