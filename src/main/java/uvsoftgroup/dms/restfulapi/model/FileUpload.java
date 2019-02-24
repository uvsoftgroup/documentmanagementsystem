package uvsoftgroup.dms.restfulapi.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="fileupload")
public class FileUpload  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name="seq_fileupload", strategy="uvsoftgroup.dms.restfulapi.utility.DocumentIdGenerator")
	@GeneratedValue(generator="seq_fileupload")
    private Long fuId;
	
	@Embedded
	FileUploadData fileUploadData;

	
	public Long getFuId() {
		return fuId;
	}

	public void setFuId(Long fuId) {
		this.fuId = fuId;
	}

	public FileUpload() {
		super();
	}
	
	

	public FileUploadData getFileUploadData() {
		return fileUploadData;
	}

	public void setFileUploadData(FileUploadData fileUploadData) {
		this.fileUploadData = fileUploadData;
	}
	
	
}
