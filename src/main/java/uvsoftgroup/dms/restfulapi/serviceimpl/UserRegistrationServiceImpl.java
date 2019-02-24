package uvsoftgroup.dms.restfulapi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import uvsoftgroup.dms.restfulapi.model.FileUpload;
import uvsoftgroup.dms.restfulapi.model.FileUploadData;
import uvsoftgroup.dms.restfulapi.model.FileUploadResult;
import uvsoftgroup.dms.restfulapi.model.UserRegistration;
import uvsoftgroup.dms.restfulapi.repository.UserRegistrationRepository;
import uvsoftgroup.dms.restfulapi.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
@Autowired
private UserRegistrationRepository userRegistrationRepository;

/**
 * @throws Exception 
 * 
 */
public void saveUserRegistration(UserRegistration userRegistration) throws Exception{
	/*
	FileUploadData fileUploadData=new FileUploadData();
	MultipartFile multipartFile = null;
	for(FileUpload fileUpload:userRegistration.getFileUploads()){
		fileUploadData=fileUpload(multipartFile);
		fileUpload.setFileUploadData(fileUploadData);
	}
	*/
	userRegistrationRepository.save(userRegistration);
}


public FileUploadData fileUpload(MultipartFile multipartFile) throws Exception {
	FileUploadData fileUploadData=new FileUploadData();
	if (multipartFile == null) {
		throw new Exception("MultipartFile is not empty!");
	}
	try {
		if (multipartFile != null) {
			fileUploadData=new FileUploadData();
			fileUploadData.setFuName(multipartFile.getOriginalFilename());
			fileUploadData.setFuType(multipartFile.getContentType());
			fileUploadData.setFuContent(multipartFile.getBytes());
			fileUploadData.setFuSize(multipartFile.getSize());
		} 
		return fileUploadData;
	} catch (Exception e) {
		throw new Exception();
	}
}


/**
 * 
 */
public List<UserRegistration> findAllUserRegistration(){
	List<UserRegistration> listUR=userRegistrationRepository.findAll();
	if(!listUR.isEmpty()){
		return listUR;		
	}
	else{
		return new ArrayList<UserRegistration>(listUR);
	}
}

/**
 * 
 */
public UserRegistration findUserRegistration(Long urId){
	UserRegistration userRegistration=userRegistrationRepository.findOne(urId);
	if(userRegistration!=null){
		return userRegistration;		
	}
	else{
		return new UserRegistration();
	}
}


/**
 * 
 */
public UserRegistration deleteUserRegistration(Long urId){
	UserRegistration userRegistration=userRegistrationRepository.findOne(urId);
	
	if(userRegistration!=null && userRegistration.getUserRegistrationId()!=null){
		userRegistrationRepository.delete(userRegistration.getUserRegistrationId());
		return userRegistration;
	}
	else{
		return new UserRegistration();
	}
}

/**
 * 
 */
public void updateUserRegistration(Long urId, UserRegistration userRegistration){
	UserRegistration userRegistrationExisting=userRegistrationRepository.findOne(urId);
	
	if(userRegistrationExisting!=null && userRegistrationExisting.getUserRegistrationId()!=null){
		userRegistrationRepository.save(userRegistration);
		
	}
	
}



}
