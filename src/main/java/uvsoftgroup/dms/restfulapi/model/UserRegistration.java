/**
 * 
 */
package uvsoftgroup.dms.restfulapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="userregistration")
public class UserRegistration implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="seq_useregistration", strategy="uvsoftgroup.dms.restfulapi.utility.UserRegistrationIdGenerator")
	@GeneratedValue(generator="seq_useregistration")
	 private Long userRegistrationId;
	 private Long userAddressId;
	 private String userRegistrationFName,userRegistrationMName,userRegistrationLName,userRegistrationName
	  ,userRegistrationPassword,userRegistrationfullName;
	 private Date userRegistrationCrDate,userRegistrationLDate;
	 
	 @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	 @JoinColumn(name="ur_ur_id")
	 private List<UserRole> userRoles=new ArrayList<>();
	 
	 @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	 @JoinColumn(name="ur_fu_id")
	 private List<FileUpload> fileUploads=new ArrayList<>();
	 
	 @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	 @JoinColumn(name="ur_ad_id")
	 List<AddressInfo> addressInfos=new ArrayList<>();
	
	
	public UserRegistration() {
		super();
	}


	public List<AddressInfo> getAddressInfos() {
		return addressInfos;
	}

	public void setAddressInfos(List<AddressInfo> addressInfos) {
		this.addressInfos = addressInfos;
	}

	public Long getUserRegistrationId() {
		return userRegistrationId;
	}

	public List<FileUpload> getFileUploads() {
		return fileUploads;
	}

	public void setFileUploads(List<FileUpload> fileUploads) {
		this.fileUploads = fileUploads;
	}



	public void setUserRegistrationId(Long userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public Long getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getUserRegistrationFName() {
		return userRegistrationFName;
	}

	public void setUserRegistrationFName(String userRegistrationFName) {
		this.userRegistrationFName = userRegistrationFName;
	}

	public String getUserRegistrationMName() {
		return userRegistrationMName;
	}

	public void setUserRegistrationMName(String userRegistrationMName) {
		this.userRegistrationMName = userRegistrationMName;
	}

	public String getUserRegistrationLName() {
		return userRegistrationLName;
	}

	public void setUserRegistrationLName(String userRegistrationLName) {
		this.userRegistrationLName = userRegistrationLName;
	}

	public String getUserRegistrationName() {
		return userRegistrationName;
	}

	public void setUserRegistrationName(String userRegistrationName) {
		this.userRegistrationName = userRegistrationName;
	}

	public String getUserRegistrationPassword() {
		return userRegistrationPassword;
	}

	public void setUserRegistrationPassword(String userRegistrationPassword) {
		this.userRegistrationPassword = userRegistrationPassword;
	}

	public String getUserRegistrationfullName() {
		return userRegistrationfullName;
	}

	public void setUserRegistrationfullName(String userRegistrationfullName) {
		this.userRegistrationfullName = userRegistrationfullName;
	}

	public Date getUserRegistrationCrDate() {
		return userRegistrationCrDate;
	}

	public void setUserRegistrationCrDate(Date userRegistrationCrDate) {
		this.userRegistrationCrDate = userRegistrationCrDate;
	}

	public Date getUserRegistrationLDate() {
		return userRegistrationLDate;
	}

	public void setUserRegistrationLDate(Date userRegistrationLDate) {
		this.userRegistrationLDate = userRegistrationLDate;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	 
}
