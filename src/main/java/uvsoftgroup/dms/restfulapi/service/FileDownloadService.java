package uvsoftgroup.dms.restfulapi.service;

import org.springframework.stereotype.Service;

import uvsoftgroup.dms.restfulapi.model.FileDownload;

@Service
public interface FileDownloadService {
	public FileDownload fileDownloadByFuId(Long fuId) throws Exception;
	
}
