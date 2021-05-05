package com.celestechicken.appweb.model;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;

import com.celestechicken.appweb.model.usuario;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="t_cliente")
public class cliente{  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @NotNull
    private String firsName;
    @NotNull
    private String lastName;
    private String email;
    private String phone; 
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birtdate; //Fecha
    private String gender; //Radio
    private String maritalStatus; //List Box
    private Integer childrens; //Numero
    @oneToONEprivate     usuarioh=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private usuario user;

}