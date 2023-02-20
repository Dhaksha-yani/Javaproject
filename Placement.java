package com.tns. Userservice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class  Placement 
{
	private Integer P_id;
	private String P_name;
        private  Integer P_password;
	
	

	public   Placement () 
	{
		super();
	}
	
	public   Placement (Integer p_id, String p_name, Integer p_password)
	{
		super();
		P_id = p_id;
		P_name = p_name;
                P_password=p_password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getP_id()
        {
		return P_id;
	}
	public void setP_id(Integer p_id) 
        {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
return P_name;
	}
	public void setP_name(String p_name)
	{
		P_name = p_name;
	}

	public Integer getP_password() 
        {
		return P_password;
return P_password;
	}
	public void setP_password(Char p_password)
	{
		P_password = p_password;
	}
	@Override
	public String toString()
	{
		return "Placement [Placement  id:"+P_id+" Placement  name:"+P_name+"   Placement password:"+P_password"]";
	}
}