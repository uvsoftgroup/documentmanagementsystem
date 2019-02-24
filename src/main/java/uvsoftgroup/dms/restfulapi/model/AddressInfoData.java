package uvsoftgroup.dms.restfulapi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

@Embeddable
@MappedSuperclass
public class AddressInfoData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Long adRefId;
	String adType;
	String adCity;
	String adRoad,adRoadType;
	String adHouseNumber;
	String adPostCode;
	String adCountry;
	
	public AddressInfoData() {
		super();
		
	}
	
	public Long getAdRefId() {
		return adRefId;
	}

	public void setAdRefId(Long adRefId) {
		this.adRefId = adRefId;
	}

	public String getAdRoadType() {
		return adRoadType;
	}

	public void setAdRoadType(String adRoadType) {
		this.adRoadType = adRoadType;
	}

	
	public String getAdType() {
		return adType;
	}
	public void setAdType(String adType) {
		this.adType = adType;
	}
	public String getAdCity() {
		return adCity;
	}
	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}
	public String getAdRoad() {
		return adRoad;
	}
	public void setAdRoad(String adRoad) {
		this.adRoad = adRoad;
	}
	public String getAdHouseNumber() {
		return adHouseNumber;
	}
	public void setAdHouseNumber(String adHouseNumber) {
		this.adHouseNumber = adHouseNumber;
	}
	public String getAdPostCode() {
		return adPostCode;
	}
	public void setAdPostCode(String adPostCode) {
		this.adPostCode = adPostCode;
	}
	public String getAdCountry() {
		return adCountry;
	}
	public void setAdCountry(String adCountry) {
		this.adCountry = adCountry;
	}
	
	

}
