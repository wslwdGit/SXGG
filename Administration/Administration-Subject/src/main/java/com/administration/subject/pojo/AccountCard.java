package com.administration.subject.pojo;

import java.util.Date;

public class AccountCard {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_card.id
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_card.account_id
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_card.path
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_card.type
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_card.add_time
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    private Date addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_card.id
     *
     * @return the value of account_card.id
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_card.id
     *
     * @param id the value for account_card.id
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_card.account_id
     *
     * @return the value of account_card.account_id
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_card.account_id
     *
     * @param accountId the value for account_card.account_id
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_card.path
     *
     * @return the value of account_card.path
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_card.path
     *
     * @param path the value for account_card.path
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_card.type
     *
     * @return the value of account_card.type
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_card.type
     *
     * @param type the value for account_card.type
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_card.add_time
     *
     * @return the value of account_card.add_time
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_card.add_time
     *
     * @param addTime the value for account_card.add_time
     *
     * @mbg.generated Fri Apr 12 15:23:05 CST 2019
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}