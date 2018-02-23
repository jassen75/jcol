package org.jcol.collection;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data; 

@Entity
@Table(name="user")
@Data  
@Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class User {
	
	@Id
	String id;
	
	String userName;

}
