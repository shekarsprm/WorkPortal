package com.nit.webportal.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nit.webportal.exceptions.DaoException;


public class UserDaoImpl implements UserDaoIF{

	@Override
	public boolean verifyCreds(String username, String password) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDTO userInfo(String username) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countLoginTimes(String username) throws DaoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatenNumberOfLoginTimes(String username) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatLastLoginTime(String username) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer updateConsectiveFailures(String username) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findConsetiveFailureCount(String username) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer expireDateVerification(String username) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateConsetiveFailureZero(String username) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String userRole(String username) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updatePassword(String username, String password) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserForm(UserDTO userDTO) throws DaoException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	/*

	private static Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
		
	public boolean verifyCreds(String username, String password)
			throws DaoException {
		LOGGER.info("$$$verifyCreds() $$$$");
		boolean verifyCreds=false;
		try {
			int count;//jdbcTemplate.queryForInt(MainSiteConstants.SELECT_USER_VERIFY,new Object[]{username,password});
			if(count==1){
				verifyCreds=true;
			}else{
				verifyCreds=false;
			}
		} catch (Exception e) {
			LOGGER.error("Error into the verifyCreds(String username, String password) "+e.getMessage());
			e.printStackTrace();
			throw new DaoException();
		}
		return verifyCreds;
	}

	public UserDTO userInfo(String username) throws DaoException {
		UserDTO userDTO=new UserDTO();
		try {
			userDTO=(UserDTO)jdbcTemplate.queryForObject(MainSiteConstants.SELECT_USER_DETAILS, new Object[]{username}, new UserMapper());
		} catch (Exception e) {
			LOGGER.error("Error into the  userInfo(String username)"+e.getMessage());
			e.printStackTrace();
			throw new DaoException();
		}
		return userDTO;
	}
	public void updatenNumberOfLoginTimes(String username)throws DaoException{
		try {
			int countIncrement=countLoginTimes(username);
			jdbcTemplate.update(MainSiteConstants.UPDATE_LOGIN_COUNT, new Object[]{countIncrement+MainSiteConstants.COUNT_PLUS,username});
		} catch (Exception e) {
			LOGGER.error("Error into the  updatenNumberOfLoginTimes(String username)"+e.getMessage());
			e.printStackTrace();
			throw new DaoException();
		}
		}
		public int countLoginTimes(String username)throws DaoException{
			Integer count=0;
			try {
				 count=jdbcTemplate.queryForInt(MainSiteConstants.SELECT_LAST_HITS_COUNT,new Object[]{username});
			} catch (Exception e) {
				LOGGER.error("Error into the countLoginTimes(String username) "+e.getMessage());
				e.printStackTrace();
				throw new DaoException();
			}		
			return count;
		}
	
  public void updatLastLoginTime(String username)throws DaoException{
	  
		try {
			Timestamp currentTimestamp=new Timestamp(new Date().getTime());
			Date currentDate=new Date();
			jdbcTemplate.update(MainSiteConstants.UPDATE_LAST_LOGIN_TIMES, new Object[]{currentTimestamp,currentDate,currentTimestamp,username});
		} catch (Exception e) {
			LOGGER.error("Error into the updatLastLoginTime(String username)"+e.getMessage());
			e.printStackTrace();
			throw new DaoException();
		}		
  }
  public Integer updateConsetiveSuccess(String username)throws DaoException{
	  Integer updateConstetiveSuccess=0;
			try {
				Timestamp currentTimestamp=new Timestamp(new Date().getTime());
				Date currentDate=new Date();
                updateConstetiveSuccess=jdbcTemplate.update(MainSiteConstants.UPDATE_CONSERTIVE_SUCCESS, new Object[]{MainSiteConstants.COUNT_ZERO,
                		 currentTimestamp,currentDate,currentTimestamp,username});
			} catch (Exception e) {
				LOGGER.error("Error into the findConsetiveFailureCount(String username) "+e.getMessage());
				e.printStackTrace();
				throw new DaoException();
			}		
			return updateConstetiveSuccess;
  }
  public Integer updateConsectiveFailures(String username)throws DaoException{
	  int consetiveFailureCount=0;
	  try {
			 consetiveFailureCount=findConsetiveFailureCount(username);
			if(consetiveFailureCount==0){
				jdbcTemplate.update(MainSiteConstants.UPDATE_CONSERTIVE_FAILUR, new Object[]{MainSiteConstants.COUNT_PLUS,username});	
				return findConsetiveFailureCount(username);
			}
			  if(consetiveFailureCount<3){
				jdbcTemplate.update(MainSiteConstants.UPDATE_CONSERTIVE_FAILUR, new Object[]{consetiveFailureCount+MainSiteConstants.COUNT_PLUS,username});
				consetiveFailureCount=findConsetiveFailureCount(username);
			  }else{
				  return consetiveFailureCount;
			  }
		} catch (Exception e) {
			LOGGER.error("Error into the  updateConsectiveFailures(String username)"+e.getMessage());
			e.printStackTrace();
			throw new DaoException();
		}
	  return consetiveFailureCount;
  }
  public Integer findConsetiveFailureCount(String username)throws DaoException{
	  Integer count=0;
		try {
			List<Integer> listCount=(List<Integer>)jdbcTemplate.query(MainSiteConstants.SELECT_CONSERTIVE_FAILURE_COUNT,new Object[]{username}, new UserRowMapperCount());
           for(Integer countV:listCount){
        	   count=countV;
           }
		} catch (Exception e) {
			LOGGER.error("Error into the findConsetiveFailureCount(String username) "+e.getMessage());
			e.printStackTrace();	
			throw new DaoException();
		}		
		return count;
  }
  public void updateConsetiveFailureZero(String username)throws DaoException{
	  try {
		  jdbcTemplate.update(MainSiteConstants.UPDATE_CONSERTIVE_FAILURE_ZERO, new Object[]{username});
	} catch (Exception e) {
		LOGGER.error("Error into the updateConsetiveFailureZero(String username) "+e.getMessage());
		e.printStackTrace();
		throw new DaoException();
	}
  }
  public Integer expireDateVerification(String username)throws DaoException{
	  Integer returnExpireDateValue=0;
	  try{
	  UserDTO userDTO=userInfo(username);
	  Date expireDate=userDTO.getExpirePasswordDate();
	  Date currentDate=new Date();
      if(currentDate.before(expireDate)){
    	  returnExpireDateValue=MainSiteConstants.DATE_CORRECT;
      }else if(currentDate.after(expireDate)){
    	  returnExpireDateValue=MainSiteConstants.DATE_EXPIRED;
      }else if(currentDate.equals(expireDate)) {
    	  returnExpireDateValue=MainSiteConstants.DATE_EQUAL;
      }
	  }catch(Exception e){
		  LOGGER.error("Error into the expireDateVerification()"+e.getMessage());
			e.printStackTrace();
			throw new DaoException();
	  }
	  return returnExpireDateValue;
  }
  
  public Integer userChecking(String username)throws DaoException{
	  Integer userChecking=0;
	  try {
		  UserDTO userDTO=userInfo(username);
		  String userStatus=userDTO.getAccountStatus();
		  if("ACTIVE".equals(userStatus)){
			  userChecking=MainSiteConstants.ACTIVE_STATUS;
		  }else if("INACTIVE".equals(userStatus)){
			  userChecking=MainSiteConstants.INACTIVE_STATUS;
		  }else if("DISABLE".equals(userStatus)){
			  userChecking=MainSiteConstants.DISABLE_STATUS;
		  }
	} catch (Exception e) {
		LOGGER.error("Error into the userChecking "+e.getMessage());
		e.printStackTrace();
		throw new DaoException();
	}
	  return userChecking;
  }
  public String userRole(String username)throws DaoException{
	  String userRole="";
	  try {
		  UserDTO userDTO=userInfo(username);
		  userRole=userDTO.getRole();
		  if("ADMIN".equals(userRole)){
			  userRole=MainSiteConstants.ADMIN_ROLE_ID.toString();
		  } else if("NORMAL".equals(userRole)){
			  userRole=MainSiteConstants.NORMA_USER_ID.toString();
		  }else if("DEV".equals(userRole)){
			  userRole=MainSiteConstants.HR_USER_ID.toString();
		  }else if("CUSTOMER".equals(userRole)){
			  userRole=	MainSiteConstants.CUSTOMER_USER_ID.toString();
		  }
	} catch (Exception e) {
		LOGGER.error("Error into the userChecking "+e.getMessage());
		e.printStackTrace();
		throw new DaoException();
	}
	  return userRole;
  }
  
public Integer updatePassword(String username,String password) throws DaoException {
	Integer UPDATEPASSWORD=MainSiteConstants.DEFAULT_ZERO;
	try{
		boolean checkPassword=verifyCreds(username,password);
    if(checkPassword){
    	try{
    	jdbcTemplate.update(MainSiteConstants.UPDATE_PASSWORD, new Object[]{username,password});
    	
    	UPDATEPASSWORD=MainSiteConstants.UPDATE_PASSWORD_SUCCESS;
    	}catch(Exception e){
    		UPDATEPASSWORD=MainSiteConstants.UPDATE_PASSWORD_FAILED;
    		LOGGER.error("Error into the updatePassword "+e.getMessage());
    		e.printStackTrace();
    		throw new DaoException();
    	}
    }else{
    	UPDATEPASSWORD=MainSiteConstants.UPDATE_PASSWORD_CURRENT_PASSWORD_INCORRECT;
    }
	}catch(Exception e){
		UPDATEPASSWORD=MainSiteConstants.UPDATE_PASSWORD_FAILED;
		LOGGER.error("Error into the updatePassword "+e.getMessage());
		e.printStackTrace();
		throw new DaoException();
		
	}
	return UPDATEPASSWORD;
}

public void updateUserForm(UserDTO userDTO)throws DaoException{
try {
	
			
			 * UPDATE USERS SET
			 * location=?,Occupation=?,profileImageName=?,profileImageLocation
			 * =?,
			 * profileImageType=?,lastname=?,websiteName=?,FacebookId=?,TwitterId
			 * =?,imgSize=?,AboutMe=? WHERE NAME=?
			 
			jdbcTemplate.update(
					MainSiteConstants.UPDATE_ADMIN_INFO,
					new Object[] { userDTO.getLocation(),
							userDTO.getOccupation(), userDTO.getImageName(),
							userDTO.getImgLocation(),
							userDTO.getChangeImageType(),
							userDTO.getLastname(), userDTO.getWebsite(),
							userDTO.getFacebook(), userDTO.getTwitter(),
							userDTO.getImgSize(),
							userDTO.getAboutMe(), userDTO.getUsername() });
} catch (Exception e) {
	LOGGER.error("Error into the updatePassword "+e.getMessage());
	e.printStackTrace();
	throw new DaoException();
}	
}

public UserDTO getUserDTO(String username)throws DaoException{
	UserDTO userDTO=new UserDTO();
	try {
		userDTO=(UserDTO)jdbcTemplate.queryForObject(MainSiteConstants.SELECT_USER_DETAILS, new Object[]{username}, new UserMapper());
	} catch (Exception e) {
		LOGGER.error("Error into the  userInfo(String username)"+e.getMessage());
		e.printStackTrace();
		throw new DaoException();
	}
	return userDTO;
}
*/}
