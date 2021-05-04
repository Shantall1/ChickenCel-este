package com.celestechicken.appweb.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;

@Getter
@setter
@NoArgsConstructor
@AllArgsCocstructor
@Builder
@Entity
@Table(name="t_usuario")
public class usuario{
    @id 
private String userID;
private String pasaword;




}
