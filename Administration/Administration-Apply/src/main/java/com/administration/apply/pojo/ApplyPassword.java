package com.administration.apply.pojo;

import java.util.Date;

public class ApplyPassword {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.id
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.login
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Long login;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.account_id
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.platform
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private String platform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.status
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.apply_time
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Date applyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.approve_user
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Long approveUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.approve_time
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private Date approveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_password.comment
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    private String comment;
    
    
    private String total;

    public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.id
     *
     * @return the value of apply_password.id
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.id
     *
     * @param id the value for apply_password.id
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.login
     *
     * @return the value of apply_password.login
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Long getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.login
     *
     * @param login the value for apply_password.login
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setLogin(Long login) {
        this.login = login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.account_id
     *
     * @return the value of apply_password.account_id
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.account_id
     *
     * @param accountId the value for apply_password.account_id
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.platform
     *
     * @return the value of apply_password.platform
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.platform
     *
     * @param platform the value for apply_password.platform
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.status
     *
     * @return the value of apply_password.status
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.status
     *
     * @param status the value for apply_password.status
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.apply_time
     *
     * @return the value of apply_password.apply_time
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.apply_time
     *
     * @param applyTime the value for apply_password.apply_time
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.approve_user
     *
     * @return the value of apply_password.approve_user
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Long getApproveUser() {
        return approveUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.approve_user
     *
     * @param approveUser the value for apply_password.approve_user
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setApproveUser(Long approveUser) {
        this.approveUser = approveUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.approve_time
     *
     * @return the value of apply_password.approve_time
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public Date getApproveTime() {
        return approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.approve_time
     *
     * @param approveTime the value for apply_password.approve_time
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_password.comment
     *
     * @return the value of apply_password.comment
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_password.comment
     *
     * @param comment the value for apply_password.comment
     *
     * @mbg.generated Wed Apr 10 10:51:34 CST 2019
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}