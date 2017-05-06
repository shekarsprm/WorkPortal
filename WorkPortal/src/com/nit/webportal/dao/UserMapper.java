package com.nit.webportal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;	

public class UserMapper implements RowMapper<UserDTO>{
public UserDTO mapRow(ResultSet rs, int arg1) throws SQLException {
    UserDTO userDTO=new UserDTO();
    userDTO.setUserId(rs.getInt("USER_ID"));	
    userDTO.setAccountStatus(rs.getString("ACCOUNTSTATUS"));
    userDTO.setConnsutiveFailures(rs.getInt("CONSECUTIVELOGINFAILURES"));
    userDTO.setEmail(rs.getString("EMAIL"));
    userDTO.setFullName(rs.getString("FULLNAME"));
    userDTO.setUsername(rs.getString("NAME"));
    userDTO.setLastLoginTime(rs.getTimestamp("LASTLOGIN"));
    userDTO.setLastPasswordChangeDate(rs.getDate("LASTPASSWORDCHANGEDATE"));
    userDTO.setLastModifiedDate(rs.getDate("LAST_MODIFIED_DATE"));
    userDTO.setLastModifiedTime(rs.getTimestamp("LAST_MODIFIED_TIME"));
    userDTO.setLastUpdatedBy(rs.getString("LAST_UPDATED_BY"));
    userDTO.setRole(rs.getString("ROLE"));
    userDTO.setPassword(rs.getString("PASSWORD"));
    userDTO.setPastPasswordOne(rs.getString("PAST_PASSWORDOne"));
    userDTO.setPastPasswordTwo(rs.getString("PAST_PASSWORDTwo"));
    userDTO.setPastPasswordThree(rs.getString("PAST_PASSWORDThree"));
    userDTO.setPresentAccountStatus(rs.getString("PRESENT_ACCOUNTSTATUS"));
    userDTO.setLoginTimes(rs.getInt("LOGIN_TIMES"));
    userDTO.setPhone(rs.getString("PHONE"));
    userDTO.setExpirePasswordDate(rs.getDate("EXPIRATIONDATE"));
    userDTO.setLastLogin(rs.getDate("LAST_MODIFIED_TIME").toString());
    userDTO.setUserComments(rs.getString("USER_COMMENT"));
    userDTO.setLastname(rs.getString("lastname"));
    userDTO.setLocation(rs.getString("location"));
    userDTO.setOccupation(rs.getString("Occupation"));
    userDTO.setImgLocation(rs.getString("profileImageLocation"));
    userDTO.setImageName(rs.getString("profileImageName"));
    userDTO.setImgSize(rs.getInt("imgSize"));
    userDTO.setFacebook(rs.getString("FacebookId"));
    userDTO.setTwitter(rs.getString("TwitterId"));
    userDTO.setWebsite(rs.getString("websiteName"));
    userDTO.setFullName(rs.getString("FULLNAME"));
    userDTO.setAboutMe(rs.getString("AboutMe"));

    return userDTO;
}
}
