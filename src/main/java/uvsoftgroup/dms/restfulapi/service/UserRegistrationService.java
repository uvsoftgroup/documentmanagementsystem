package uvsoftgroup.dms.restfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import uvsoftgroup.dms.restfulapi.model.FileUploadData;
import uvsoftgroup.dms.restfulapi.model.UserRegistration;

@Service
public interface UserRegistrationService {
	public void saveUserRegistration(UserRegistration userRegistration) throws Exception;
	public List<UserRegistration> findAllUserRegistration();
	public UserRegistration findUserRegistration(Long urId);
	public UserRegistration deleteUserRegistration(Long urId);
	public void updateUserRegistration(Long urId, UserRegistration userRegistration);
	public FileUploadData fileUpload(MultipartFile multipartFile) throws Exception;
}
