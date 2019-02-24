package uvsoftgroup.dms.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import uvsoftgroup.dms.restfulapi.model.UserRole;

@RepositoryRestResource(collectionResourceRel = "userrole", path = "userrole")
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{

}
