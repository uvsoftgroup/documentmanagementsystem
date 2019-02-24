package uvsoftgroup.dms.restfulapi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import uvsoftgroup.dms.restfulapi.model.FileUpload;
import uvsoftgroup.dms.restfulapi.model.FileUploadResult;
import uvsoftgroup.dms.restfulapi.repository.FileUploadRepository;
import uvsoftgroup.dms.restfulapi.service.FileUploadService;

@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Autowired
	private FileUploadRepository fileUploadRepository;

	/**
	 * 
	 * @param {@link MultipartFile} multipartFile
	 * @return {@link FileUploadResult}
	 * @throws Exception
	 */
	public FileUploadResult fileUpload(MultipartFile multipartFile) throws Exception {
		FileUpload fileUpload = new FileUpload();
		FileUploadResult fileUploadResult = new FileUploadResult();
		if (multipartFile == null) {
			throw new Exception("MultipartFile is not empty!");
		}

		try {
			// set file info
			if (multipartFile != null) {
				fileUpload = new FileUpload();
				
				fileUpload.getFileUploadData().setFuName(multipartFile.getOriginalFilename());
				fileUpload.getFileUploadData().setFuType(multipartFile.getContentType());
				fileUpload.getFileUploadData().setFuContent(multipartFile.getBytes());
				fileUpload.getFileUploadData().setFuSize(multipartFile.getSize());
				// save the file into the database
				fileUploadRepository.save(fileUpload);
				fileUploadResult = new FileUploadResult();
				fileUploadResult.setFurName(multipartFile.getOriginalFilename());
				fileUploadResult.setFurType(multipartFile.getContentType());
				fileUploadResult.setFurSize(multipartFile.getSize());
				return fileUploadResult;
			} else {
				return new FileUploadResult();
			}
		} catch (Exception e) {
			throw new Exception();
		}
	}

	/**
	 * 
	 * @param multipartFiles
	 * @return list of {@link FileUploadResult}
	 * @throws Exception
	 */
	public List<FileUploadResult> fileUploads(List<MultipartFile> multipartFiles) throws Exception {
		FileUpload fileUpload = new FileUpload();
		FileUploadResult fileUploadResult = new FileUploadResult();
		List<FileUploadResult> fileUploadResults = new ArrayList<FileUploadResult>();
		if (multipartFiles == null) {
			throw new Exception("MultipartFile(s) is not empty!");
		}
		try {
			if (!multipartFiles.isEmpty()) {
				for (MultipartFile multipartFile : multipartFiles) {
					fileUpload = new FileUpload();
					fileUpload.getFileUploadData().setFuName(multipartFile.getOriginalFilename());
					fileUpload.getFileUploadData().setFuType(multipartFile.getContentType());
					fileUpload.getFileUploadData().setFuContent(multipartFile.getBytes());
					fileUpload.getFileUploadData().setFuSize(multipartFile.getSize());
					// save the file into the database
					fileUploadRepository.save(fileUpload);
					fileUploadResult = new FileUploadResult();
					fileUploadResult.setFurName(multipartFile.getOriginalFilename());
					fileUploadResult.setFurType(multipartFile.getContentType());
					fileUploadResult.setFurSize(multipartFile.getSize());
					fileUploadResults.add(fileUploadResult);
				}
				return fileUploadResults;
			} else {
				return new ArrayList<FileUploadResult>(fileUploadResults);
			}

		} catch (Exception e) {
			throw new Exception();
		}
	}

}
