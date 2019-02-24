package uvsoftgroup.dms.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uvsoftgroup.dms.restfulapi.model.AddressInfo;

@RepositoryRestResource(collectionResourceRel = "addressinfo", path = "addressinfo")
public interface AddressInfoRepository extends JpaRepository<AddressInfo, Long>{

}
