package co.edu.uco.asistenciauco.application.outputport.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// TODO: Cuidado con dejar quemado el literal
@Table(name = "TipoIdentificacion")
public final class TipoIdentificacionEntity {

	@Id
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "id")
	private UUID id;
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "clave")
	private String clave;
	// TODO: Cuidado con dejar quemado el literal
	@Column(name = "nombre")
	private String nombre;

	public TipoIdentificacionEntity() {
		setDefaultId();
		setDefaultClave();
		setDefaultNombre();
	}

	public TipoIdentificacionEntity(final UUID id) {
		setId(id);
		setDefaultClave();
		setDefaultNombre();
	}

	public TipoIdentificacionEntity(final UUID id, final String clave, final String nombre) {
		setId(id);
		setClave(clave);
		setNombre(nombre);
	}

	public UUID getId() {
		return id;
	}

	public void setId(final UUID id) {
		this.id = id;
	}

	private void setDefaultId() {
		// TODO: Obtener valor por defecto
		// TODO: Lo más probable es que este valor esté en algún lugar o algún parámetro
		UUID defaultValue = null;
		setId(defaultValue);
	}

	public String getClave() {
		return clave;
	}

	public void setClave(final String clave) {
		// TODO: Cuidado con la limpieza de datos para evitar datos NULOS
		this.clave = clave;
	}

	private void setDefaultClave() {
		// TODO: Obtener valor por defecto
		// TODO: Lo más probable es que este valor esté en algún lugar o algún parámetro
		var defaultValue = "";
		setClave(defaultValue);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		// TODO: Cuidado con la limpieza de datos para evitar datos NULOS
		this.nombre = nombre;
	}

	public void setDefaultNombre() {
		// TODO: Obtener valor por defecto
		// TODO: Lo más probable es que este valor esté en algún lugar o algún parámetro
		var defaultValue = "";
		setNombre(defaultValue);
	}

}
