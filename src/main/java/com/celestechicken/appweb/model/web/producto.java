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
@Table(name="t_producto")
public class producto{  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @NotNull
    private String descripcion;
    @NotNull
    private BigDecialmal precio;
 }