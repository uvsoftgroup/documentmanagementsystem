package uvsoftgroup.dms.restfulapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uvsoftgroup.dms.restfulapi.model.FileDownload;
import uvsoftgroup.dms.restfulapi.model.FileUpload;
import uvsoftgroup.dms.restfulapi.repository.FileUploadRepository;
import uvsoftgroup.dms.restfulapi.service.FileDownloadService;

@Service
public class FileDownloadServiceImpl implements FileDownloadService {
	@Autowired
	private FileUploadRepository fileUploadRepository;
	
   /**
    * 
    * @param fuId
    * @return {@link FileDownload}
    * @throws Exception
    */
	public FileDownload fileDownloadByFuId(Long fuId) throws Exception{
		FileUpload  fileUpload=fileUploadRepository.findOne(fuId);
		FileDownload fileDownload=new FileDownload();
		try {
			// download file info
			if (fileUpload!= null) {
				fileDownload=new FileDownload();
				fileDownload.setFdId(fileUpload.getFuId());
				fileDownload.setFdName(fileUpload.getFileUploadData().getFuName());
				fileDownload.setFdType(fileUpload.getFileUploadData().getFuType());
				fileDownload.setFdSize(fileUpload.getFileUploadData().getFuSize());
				fileDownload.setFdContent(fileUpload.getFileUploadData().getFuContent());
				return fileDownload;
			} else {
				return new FileDownload();
			}
		} catch (Exception e) {
			throw new Exception();
		}
	}
	
	
	
}
