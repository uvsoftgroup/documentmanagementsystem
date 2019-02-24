package uvsoftgroup.dms.restfulapi.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import uvsoftgroup.dms.restfulapi.model.FileUploadResult;
import uvsoftgroup.dms.restfulapi.service.FileUploadService;

@RestController
@RequestMapping(value="/fileuploadservice")
public class FileUploadServiceController {
@Autowired
private FileUploadService fileUploadService;

@RequestMapping(value="/fileupload",method=RequestMethod.POST)
public FileUploadResult fileUpload(@RequestParam("fileupload") MultipartFile fileupload)throws Exception{
		FileUploadResult fileUploadResult = new FileUploadResult();
		if(fileupload==null){
			throw new Exception("MultipartFile is not empty!");
		}
		try {
			fileUploadResult = fileUploadService.fileUpload(fileupload);
			if (fileUploadResult != null) {
				return fileUploadResult;
			} else {
				return new FileUploadResult();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileUploadResult;
	}


@RequestMapping(value="/fileuploads",method=RequestMethod.POST)
public List<FileUploadResult> fileUpload(@RequestParam("fileuploads") List<MultipartFile> fileuploads)throws Exception{
		List<FileUploadResult> fileUploadResults = new ArrayList<FileUploadResult>();
		if(fileuploads==null){
			throw new Exception("MultipartFile(s) is not empty!");
		}
		try {
			fileUploadResults = fileUploadService.fileUploads(fileuploads);
			if (!fileUploadResults.isEmpty()) {
				return fileUploadResults;
			} else {
				return new ArrayList<FileUploadResult>(fileUploadResults);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileUploadResults;
	}

}
