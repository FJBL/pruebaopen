package mx.gob.sat.prueba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * Clase de dominio About mapea objetos de persistencia con estructuras de base
 * de datos
 * 
 * @author ACTT - SAT
 * @version 1.0
 *
 */

@Entity
@Data
@Table(name = "SMVT_ABOUT")
public class About {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idabout")
	private Long idAbout;

	@Column(name = "instructions")
	@Size(min = 0, max = 15000)
	private String instructions;

	@Column(name = "responsabilities")
	@Size(min = 0, max = 15000)
	private String responsabilities;

	@Column(name = "termsconditions")
	@Size(min = 0, max = 15000)
	private String termsConditions;

	@Column(name = "privacypolicy")
	@Size(min = 0, max = 15000)
	private String privacyPolicy;
	
	@Column(name = "complains")
	@Size(min = 0, max = 15000)
	private String complains;

	@Temporal(TemporalType.DATE)
	@Column(name = "createdat")
	@JsonIgnore
	private Date createdAt;

	@Column(name = "modifiedby")
	@JsonIgnore
	private Long modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "modifiedat")
	@JsonIgnore
	private Date modifiedAt;

	@Column(name = "iduser")
	@JsonIgnore
	private Long idUser;

	@Column(name = "logicaldelete")
	@JsonIgnore
	private boolean logicalDelete;

}
