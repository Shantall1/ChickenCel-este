package com.celestechicken.appweb.model;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @oneToONEprivate Usuario (fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private Usuerio user;

}