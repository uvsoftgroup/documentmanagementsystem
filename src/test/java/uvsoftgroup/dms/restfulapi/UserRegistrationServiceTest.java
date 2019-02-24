package uvsoftgroup.dms.restfulapi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import uvsoftgroup.dms.restfulapi.model.AddressInfo;
import uvsoftgroup.dms.restfulapi.model.AddressInfoData;
import uvsoftgroup.dms.restfulapi.model.FileUpload;
import uvsoftgroup.dms.restfulapi.model.FileUploadData;
import uvsoftgroup.dms.restfulapi.model.UserRegistration;
import uvsoftgroup.dms.restfulapi.model.UserRole;
import uvsoftgroup.dms.restfulapi.service.UserRegistrationService;
import uvsoftgroup.dms.restfulapi.utility.FileToBytes;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRegistrationServiceTest {
	@Autowired
	private UserRegistrationService userRegistrationService;

	@Test
	@Ignore
	public void saveUserRegistrationTestSuite() throws Exception {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("2018-12-23");
	    // user role info
		UserRole userRole = new UserRole();
		userRole.setUserRoleType("AD");
		userRole.setUserRoleName("Admin");
		userRole.setUserRoleDate(date);

		UserRole userRole1 = new UserRole();
		userRole1.setUserRoleType("AO");
		userRole1.setUserRoleName("Admin Officer");
		userRole1.setUserRoleDate(date);
		
		UserRole userRole2 = new UserRole();
		userRole2.setUserRoleType("AO");
		userRole2.setUserRoleName("Admin Desk");
		userRole2.setUserRoleDate(date);
        // add to user role into the user list
		List<UserRole> userRoles = new ArrayList<>();
		userRoles.add(userRole);
		userRoles.add(userRole1);
		userRoles.add(userRole2);
		
		String filePath="C://videos/uvsoftgroup_logo/template.jpg";
		String filePath1="C://videos/web_programming/building_information.xesc";
		
		FileUploadData fdata=new FileUploadData();
		fdata.setFuName("Test file 1");
		fdata.setFuContent(FileToBytes.readBytesFromFile(filePath));
		
		FileUploadData fdata1=new FileUploadData();
		fdata1.setFuName("building_information vedio");
		fdata1.setFuContent(FileToBytes.readBytesFromFile(filePath1));
		// file upload info
		FileUpload fileUpload = new FileUpload();
		fileUpload.setFileUploadData(fdata);
		
		FileUpload fileUpload1 = new FileUpload();
		fileUpload1.setFileUploadData(fdata1);
		
        // add file into the list
		List<FileUpload> fileUploads = new ArrayList<>();
		fileUploads.add(fileUpload1);
		fileUploads.add(fileUpload);
		
		AddressInfoData address=new AddressInfoData();
		address.setAdRefId(1000L);
		address.setAdCity("Karlsruhe");
		address.setAdCountry("Germany");
		address.setAdHouseNumber("test");
	    address.setAdPostCode("test code");
	    address.setAdRoad("test road");
	    address.setAdRoadType("primary");
	    address.setAdType("Office");
	    
	    AddressInfo addressInfo=new AddressInfo();
	  
	    addressInfo.setAddressInfoData(address);
	    
	    List<AddressInfo> addressInfos=new ArrayList<>();
	    addressInfos.add(addressInfo);
		
	    // user registration info
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.setUserAddressId(address.getAdRefId());
		userRegistration.setUserRegistrationFName("Test");
		userRegistration.setUserRegistrationMName("Middle Test");
		userRegistration.setUserRegistrationLName("Last Test");
		userRegistration.setUserRegistrationfullName("Test Test");
		userRegistration.setUserRegistrationName("tester");
	    userRegistration.setUserRegistrationPassword("tester");
	    userRegistration.setUserRegistrationCrDate(date);
	     // set user role to the user
		userRegistration.setUserRoles(userRoles);
	    // set file or document to the user
	    userRegistration.setFileUploads(fileUploads);
	     // set address to the user
		userRegistration.setAddressInfos(addressInfos);

		saveUserRegistrationTestCase(userRegistration);
	}

	private void saveUserRegistrationTestCase(UserRegistration userRegistration) throws Exception {
		userRegistrationService.saveUserRegistration(userRegistration);
	}
}
