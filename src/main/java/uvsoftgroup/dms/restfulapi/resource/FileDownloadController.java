package uvsoftgroup.dms.restfulapi.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import uvsoftgroup.dms.restfulapi.model.FileDownload;
import uvsoftgroup.dms.restfulapi.service.FileDownloadService;

@RestController
@RequestMapping("/filedownload")
public class FileDownloadController {
	@Autowired
	private FileDownloadService fileDownloadService;
	
	@RequestMapping(value="/{fuId}",method=RequestMethod.GET)
	public FileDownload fileDownloadByFuId(@PathVariable("fuId") Long fuId) throws Exception{
		FileDownload fileDownload=fileDownloadService.fileDownloadByFuId(fuId);
		if(fileDownload!=null){
			return fileDownload;
		}
		else{
			return new FileDownload();
		}
		
	}

}
