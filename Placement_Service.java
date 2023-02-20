package com.tns. Placementservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Placement_Service 
{
	@Autowired
	private  Placement_Service_Repository repo;
	
	public List<Placement> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Placement pl)
	{
		repo.save(pl);
	}
	public Placement get(Integer p_id)
	{
		return repo.findById(p_id).get();
	}
	public void delete(Integer p_id)
	{
		repo.deleteById(p_id);
	}
	
}
