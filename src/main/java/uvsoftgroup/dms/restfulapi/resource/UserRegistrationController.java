package uvsoftgroup.dms.restfulapi.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uvsoftgroup.dms.restfulapi.model.UserRegistration;
import uvsoftgroup.dms.restfulapi.service.UserRegistrationService;

@RestController
@RequestMapping(value="/userregistration")
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<UserRegistration> findAllUserRegistration(){
		List<UserRegistration> list=userRegistrationService.findAllUserRegistration();
		return list;
	}
	@RequestMapping(value="/{urId}",method=RequestMethod.GET)
	public UserRegistration findUserRegistration(@PathVariable("urId") Long urId){
		UserRegistration userRegistration=userRegistrationService.findUserRegistration(urId);
		return userRegistration;
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUserRegistration(@Valid @RequestBody UserRegistration userRegistration) throws Exception{
		userRegistrationService.saveUserRegistration(userRegistration);
		}
	
	@RequestMapping(value="/{urId}",method=RequestMethod.PUT)
	public void updateUserRegistration(@Valid @RequestBody UserRegistration userRegistration,@PathVariable("urId") Long urId){
		userRegistrationService.updateUserRegistration(urId, userRegistration);
		
	}
	
	@RequestMapping(value="/{urId}",method=RequestMethod.DELETE)
	public UserRegistration deleteUserRegistration(@PathVariable("urId") Long urId){
		UserRegistration userRegistration=userRegistrationService.deleteUserRegistration(urId);
		return userRegistration;
	}
	

}
