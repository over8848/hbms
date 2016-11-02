package com.newstar.hbms.candidate2.domain;

import com.newstar.hbms.basedata.domain.ListItem;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by fellowlong on 2014-08-25.
 */
public class Candidate implements Serializable {

  /**
   * 编号
   */
  private Long id;

  /**
   * 姓名
   */
  private String name;

  /**
   * 性别
   */
  private Boolean sex;

  /**
   * 出生日期
   */
  private Date birthday;

  /**
   * 工作年限
   */
  private Integer workingYears;

  /**
   * 居住地
   */
  private String residence;

  /**
   * 海外学习/工作经历
   */
  private Boolean abroadStudyOrWork;

  /**
   * 电子邮箱
   */
  private String email;

  /**
   * 所属行业编号
   */
  private Long industryId;

  /**
   * 所属行业
   */
  private ListItem industry;

  /**
   * 目前公司
   */
  private String currentCompany;

  /**
   * 目前职务
   */
  private String currentPosition;

  /**
   * 目前年薪
   */
  private double currentAnnualSalary;

  /**
   * 手机
   */
  private String mobilePhone;

  /**
   * 家庭电话
   */
  private String homePhone;

  /**
   * 公司电话
   */
  private String companyPhone;

  /**
   * 求职状态编号
   */
  private Long jobHuntingStatusId;

  /**
   * 求职状态
   */
  private ListItem jobHuntingStatus;

  /**
   * 关键词
   */
  private String keyword;

  /**
   * 国家编号
   */
  private Long countryId;

  /**
   * 国家
   */
  private ListItem country;

  /**
   * 身高
   */
  private Long high;

  /**
   * 婚姻状况编号
   */
  private Long maritalStatusId;
  /**
   * 婚姻状况
   */
  private ListItem maritalStatus;

  /**
   * 社交号码
   */
  private String snsNo;

  /**
   * 是否有效
   */
  private Boolean yn;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 创建人
   */
  private String createUser;

  /**
   * 修改时间
   */
  private Date updateTime;

  /**
   * 修改人
   */
  private String updateUser;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getSex() {
    return sex;
  }

  public void setSex(Boolean sex) {
    this.sex = sex;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getWorkingYears() {
    return workingYears;
  }

  public void setWorkingYears(Integer workingYears) {
    this.workingYears = workingYears;
  }

  public String getResidence() {
    return residence;
  }

  public void setResidence(String residence) {
    this.residence = residence;
  }

  public Boolean getAbroadStudyOrWork() {
    return abroadStudyOrWork;
  }

  public void setAbroadStudyOrWork(Boolean abroadStudyOrWork) {
    this.abroadStudyOrWork = abroadStudyOrWork;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getIndustryId() {
    return industryId;
  }

  public void setIndustryId(Long industryId) {
    this.industryId = industryId;
  }

  public ListItem getIndustry() {
    return industry;
  }

  public void setIndustry(ListItem industry) {
    this.industry = industry;
  }

  public String getCurrentCompany() {
    return currentCompany;
  }

  public void setCurrentCompany(String currentCompany) {
    this.currentCompany = currentCompany;
  }

  public String getCurrentPosition() {
    return currentPosition;
  }

  public void setCurrentPosition(String currentPosition) {
    this.currentPosition = currentPosition;
  }

  public double getCurrentAnnualSalary() {
    return currentAnnualSalary;
  }

  public void setCurrentAnnualSalary(double currentAnnualSalary) {
    this.currentAnnualSalary = currentAnnualSalary;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getCompanyPhone() {
    return companyPhone;
  }

  public void setCompanyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
  }

  public Long getJobHuntingStatusId() {
    return jobHuntingStatusId;
  }

  public void setJobHuntingStatusId(Long jobHuntingStatusId) {
    this.jobHuntingStatusId = jobHuntingStatusId;
  }

  public ListItem getJobHuntingStatus() {
    return jobHuntingStatus;
  }

  public void setJobHuntingStatus(ListItem jobHuntingStatus) {
    this.jobHuntingStatus = jobHuntingStatus;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public Long getCountryId() {
    return countryId;
  }

  public void setCountryId(Long countryId) {
    this.countryId = countryId;
  }

  public ListItem getCountry() {
    return country;
  }

  public void setCountry(ListItem country) {
    this.country = country;
  }

  public Long getHigh() {
    return high;
  }

  public void setHigh(Long high) {
    this.high = high;
  }

  public Long getMaritalStatusId() {
    return maritalStatusId;
  }

  public void setMaritalStatusId(Long maritalStatusId) {
    this.maritalStatusId = maritalStatusId;
  }

  public ListItem getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(ListItem maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public String getSnsNo() {
    return snsNo;
  }

  public void setSnsNo(String snsNo) {
    this.snsNo = snsNo;
  }

  public Boolean getYn() {
    return yn;
  }

  public void setYn(Boolean yn) {
    this.yn = yn;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

}