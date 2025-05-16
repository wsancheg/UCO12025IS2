package co.edu.uco.asistenciauco.application.outputport.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
// TODO: Cuidado con dejar quemado el literal
@Table(name = "Estudiante")
public final class EstudianteEntity {

	@Id
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "id")
	private UUID id;
	// TODO: Cuidado con dejar quemado el literal
	@ManyToOne
	@JoinColumn(name = "tipoIdentificacion")
	private TipoIdentificacionEntity tipoIdentificacion;
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "numeroIdentificacion")
	private String numeroIdentificacion;
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "nombresCompletos")
	private String nombresCompletos;

	public EstudianteEntity() {
		setDefaultId();
		setDefaultTipoIdentificacion();
		setDefaultNumeroIdentificacion();
		setDefaultNombresCompletos();
	}

	public EstudianteEntity(final UUID id) {
		setId(id);
		setDefaultTipoIdentificacion();
		setDefaultNumeroIdentificacion();
		setDefaultNombresCompletos();
	}

	public EstudianteEntity(final UUID id, final TipoIdentificacionEntity tipoIdentificacion,
			final String numeroIdentificacion, final String nombresCompletos) {
		setId(id);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setNombresCompletos(nombresCompletos);
	}

	public UUID getId() {
		return id;
	}

	public void setId(final UUID id) {
		this.id = id;
	}

	private void setDefaultId() {
		setId(null);
	}

	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	private void setDefaultTipoIdentificacion() {
		setTipoIdentificacion(new TipoIdentificacionEntity());
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(final String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	private void setDefaultNumeroIdentificacion() {
		setNumeroIdentificacion("");
	}

	public String getNombresCompletos() {
		return nombresCompletos;
	}

	public void setNombresCompletos(final String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}

	private void setDefaultNombresCompletos() {
		setNombresCompletos("");
	}

}
