package co.edu.uco.asistenciauco.application.outputport.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class AsistenciaEntity {

	@Id
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "id")
	private UUID id;

}
