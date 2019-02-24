package uvsoftgroup.dms.restfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import uvsoftgroup.dms.restfulapi.model.FileUploadResult;

@Service
public interface FileUploadService {
	public FileUploadResult fileUpload(MultipartFile multipartFile) throws Exception;
	public List<FileUploadResult> fileUploads(List<MultipartFile> multipartFiles)throws Exception;
}
