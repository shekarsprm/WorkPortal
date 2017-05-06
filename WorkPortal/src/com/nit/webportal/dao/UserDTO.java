package com.nit.webportal.dao;

import java.sql.Timestamp;
import java.util.Date;

public class UserDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	private String email;
	private String password;
	private String lastLogin;
	private Timestamp lastModifiedTime;
	private Date lastModifiedDate;
	private String lastUpdatedBy;
	private String accountStatus;
	private String userComments;
	private Integer connsutiveFailures;
	private Date expirePasswordDate;
	private String fullName;
	private Timestamp lastLoginTime;
	private Date lastPasswordChangeDate;
	private Integer userId;
	private String phone;
	private String role;
	private String pastPasswordOne;
	private Integer loginTimes;
	private String presentAccountStatus;
	private String pastPasswordTwo;
	private String pastPasswordThree;
	
	
	private String location;
	private String Occupation;
	private String imgLocation;
	private String ChangeImageType;
	private String imageName;
	private Integer imgSize;
	private String Email;
	private String Website;
	private String Facebook;
	private String Twitter;
	private String aboutMe;
	private String lastname;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getImgLocation() {
		return imgLocation;
	}

	public void setImgLocation(String imgLocation) {
		this.imgLocation = imgLocation;
	}

	public String getChangeImageType() {
		return ChangeImageType;
	}

	public void setChangeImageType(String changeImageType) {
		ChangeImageType = changeImageType;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Integer getImgSize() {
		return imgSize;
	}

	public void setImgSize(Integer imgSize) {
		this.imgSize = imgSize;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getFacebook() {
		return Facebook;
	}

	public void setFacebook(String facebook) {
		Facebook = facebook;
	}

	public String getTwitter() {
		return Twitter;
	}

	public void setTwitter(String twitter) {
		Twitter = twitter;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Timestamp getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Timestamp lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getUserComments() {
		return userComments;
	}

	public void setUserComments(String userComments) {
		this.userComments = userComments;
	}

	public Integer getConnsutiveFailures() {
		return connsutiveFailures;
	}

	public void setConnsutiveFailures(Integer connsutiveFailures) {
		this.connsutiveFailures = connsutiveFailures;
	}

	public Date getExpirePasswordDate() {
		return expirePasswordDate;
	}

	public void setExpirePasswordDate(Date expirePasswordDate) {
		this.expirePasswordDate = expirePasswordDate;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastPasswordChangeDate() {
		return lastPasswordChangeDate;
	}

	public void setLastPasswordChangeDate(Date lastPasswordChangeDate) {
		this.lastPasswordChangeDate = lastPasswordChangeDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPastPasswordOne() {
		return pastPasswordOne;
	}

	public void setPastPasswordOne(String pastPasswordOne) {
		this.pastPasswordOne = pastPasswordOne;
	}

	public Integer getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(Integer loginTimes) {
		this.loginTimes = loginTimes;
	}

	public String getPresentAccountStatus() {
		return presentAccountStatus;
	}

	public void setPresentAccountStatus(String presentAccountStatus) {
		this.presentAccountStatus = presentAccountStatus;
	}

	public String getPastPasswordTwo() {
		return pastPasswordTwo;
	}

	public void setPastPasswordTwo(String pastPasswordTwo) {
		this.pastPasswordTwo = pastPasswordTwo;
	}

	public String getPastPasswordThree() {
		return pastPasswordThree;
	}

	public void setPastPasswordThree(String pastPasswordThree) {
		this.pastPasswordThree = pastPasswordThree;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", email=" + email
				+ ", password=" + password + ", lastLogin=" + lastLogin
				+ ", lastModifiedTime=" + lastModifiedTime
				+ ", lastModifiedDate=" + lastModifiedDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", accountStatus=" + accountStatus
				+ ", userComments=" + userComments + ", connsutiveFailures="
				+ connsutiveFailures + ", expirePasswordDate="
				+ expirePasswordDate + ", fullName=" + fullName
				+ ", lastLoginTime=" + lastLoginTime
				+ ", lastPasswordChangeDate=" + lastPasswordChangeDate
				+ ", userId=" + userId + ", phone=" + phone + ", role=" + role
				+ ", pastPasswordOne=" + pastPasswordOne + ", loginTimes="
				+ loginTimes + ", presentAccountStatus=" + presentAccountStatus
				+ ", pastPasswordTwo=" + pastPasswordTwo
				+ ", pastPasswordThree=" + pastPasswordThree + ", location="
				+ location + ", Occupation=" + Occupation + ", imgLocation="
				+ imgLocation + ", ChangeImageType=" + ChangeImageType
				+ ", imageName=" + imageName + ", imgSize=" + imgSize
				+ ", Email=" + Email + ", Website=" + Website + ", Facebook="
				+ Facebook + ", Twitter=" + Twitter + ", aboutMe=" + aboutMe
				+ "]";
	}

}
