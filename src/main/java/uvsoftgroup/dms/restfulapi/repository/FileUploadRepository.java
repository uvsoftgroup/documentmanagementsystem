package uvsoftgroup.dms.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uvsoftgroup.dms.restfulapi.model.FileUpload;

@Repository
public interface FileUploadRepository extends JpaRepository<FileUpload, Long>{
	
}
