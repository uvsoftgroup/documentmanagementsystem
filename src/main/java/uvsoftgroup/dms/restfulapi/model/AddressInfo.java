package uvsoftgroup.dms.restfulapi.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="addressinfo")
public class AddressInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="seq_useregistration", strategy="uvsoftgroup.dms.restfulapi.utility.AddressInfoIdGenerator")
	@GeneratedValue(generator="seq_useregistration")
	Long adId;
	@Embedded
	AddressInfoData addressInfoData;
	
	
	public AddressInfo() {
		super();
		
	}

	
	public AddressInfoData getAddressInfoData() {
		return addressInfoData;
	}


	public void setAddressInfoData(AddressInfoData addressInfoData) {
		this.addressInfoData = addressInfoData;
	}


	public Long getAdId() {
		return adId;
	}

	public void setAdId(Long adId) {
		this.adId = adId;
	}
	

}
