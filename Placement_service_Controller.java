package com.tns.Placementservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  Placement_service_Controller
{
	@Autowired(required=true)
	private  Placement_Service service;
	
	@GetMapping("/ Placementservice")
	public java.util.List<Placement> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/ Placementservice/{p_id}")
	public ResponseEntity< Placement> get(@PathVariable Integer P_id)
	{
		try
		{
			 Placement pl=service.get(P_id);
return new ResponseEntity<User>( pl,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/ Placementservice")
	public void add(@RequestBody Placement pl)
	{
		service.save(pl);
}
	
	@PutMapping("/ placementservice/{p_id}")
	public ResponseEntity<?> update(@RequestBody  Placement  pl, @PathVariable Integer P_id)
	{
		 Placement existpl=service.get(P_id);
		service.save(existpl);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/ placementservice/{p_id}")
	public void delete(@PathVariable Integer p_id)
	{
		service.delete(p_id);
	}
}