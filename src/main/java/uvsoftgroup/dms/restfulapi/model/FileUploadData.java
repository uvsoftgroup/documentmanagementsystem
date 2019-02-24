package uvsoftgroup.dms.restfulapi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

@Embeddable
@MappedSuperclass
public class FileUploadData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fuName;
	private String fuType;
	private Long fuSize;
	//@Lob
    private byte[] fuContent;
  
    
	public byte[] getFuContent() {
		return fuContent;
	}
	public void setFuContent(byte[] fuContent) {
		this.fuContent = fuContent;
	}
	public FileUploadData() {
		super();
		
	}
	
	public String getFuName() {
		return fuName;
	}
	public void setFuName(String fuName) {
		this.fuName = fuName;
	}
	public String getFuType() {
		return fuType;
	}
	public void setFuType(String fuType) {
		this.fuType = fuType;
	}
	public Long getFuSize() {
		return fuSize;
	}
	public void setFuSize(Long fuSize) {
		this.fuSize = fuSize;
	}
	
}
