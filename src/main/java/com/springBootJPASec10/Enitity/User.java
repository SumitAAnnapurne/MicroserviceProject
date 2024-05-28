package com.springBootJPASec10.Enitity;

//import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	// IDENTITY PK generation strategy internally used DB provided auto
	//increment the PK
	
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	// if we didn't mention the column name the jpa automatically provide the variable name
	// if it has multiple words then it will add underscore automatically _
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
}
