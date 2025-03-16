package com.blog.api.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "Users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "user_name",nullable = false,length = 100)
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String about; 

	
}
