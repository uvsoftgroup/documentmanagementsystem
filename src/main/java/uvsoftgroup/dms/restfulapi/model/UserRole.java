/**
 * 
 */
package uvsoftgroup.dms.restfulapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="userrole")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="seq_userrole", strategy="uvsoftgroup.dms.restfulapi.utility.UserRoleIdGenerator")
	@GeneratedValue(generator="seq_userrole")
	 private Long userRoleId;
	 private String userRoleName,userRoleType;
	 private Date userRoleDate;
	 
	 
	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public String getUserRoleType() {
		return userRoleType;
	}
	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}
	public Date getUserRoleDate() {
		return userRoleDate;
	}
	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}
	 
	 
}
