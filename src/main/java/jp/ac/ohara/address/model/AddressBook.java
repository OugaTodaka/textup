package jp.ac.ohara.address.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="addresses")
public class AddressBook{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	
	@Column(length=32,nullable=false)
	private String last_name;
	
	@Column(length=32,nullable=false)
	private String first_name;

	@Column(length=1024,nullable=false)
	private String email_address;
		
	@Column(nullable=false)
	private Date updated_at;
	
	@Column(nullable=true)
	private Date deleted_at;
	
	@Column(nullable=false)
	private Date created_at;
}