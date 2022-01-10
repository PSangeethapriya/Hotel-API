package com.example.hotelAPI.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	    private String name;
	    private String surname;
	    private String email;
	    private String password;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getEmail() {
			return email;
		}
public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		 public String hashPassword(String plainTextPassword){
		        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
		    }
		public void setEmail(String email2) {
			// TODO Auto-generated method stub
			
		}
}
