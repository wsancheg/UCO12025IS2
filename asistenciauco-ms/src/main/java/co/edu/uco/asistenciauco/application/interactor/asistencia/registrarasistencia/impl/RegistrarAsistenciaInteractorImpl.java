package co.edu.uco.asistenciauco.application.interactor.asistencia.registrarasistencia.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.asistenciauco.application.interactor.asistencia.registrarasistencia.RegistrarAsistenciaInteractor;
import co.edu.uco.asistenciauco.application.interactor.asistencia.registrarasistencia.dto.request.RegistrarAsistenciaRequestDTO;
import co.edu.uco.asistenciauco.application.interactor.asistencia.registrarasistencia.dto.response.RegistrarAsistenciaResponseDTO;
import co.edu.uco.asistenciauco.application.usecase.asistencia.registrarasistencia.RegistrarAsistenciaUseCase;
import co.edu.uco.asistenciauco.application.usecase.asistencia.registrarasistencia.domain.Asistencia;
import jakarta.transaction.Transactional;

@Service
public class RegistrarAsistenciaInteractorImpl implements RegistrarAsistenciaInteractor {

	private RegistrarAsistenciaUseCase registrarAsistenciaUseCase;

	public RegistrarAsistenciaInteractorImpl(RegistrarAsistenciaUseCase registrarAsistenciaUseCase) {
		this.registrarAsistenciaUseCase = registrarAsistenciaUseCase;
	}

	@Override
	@Transactional
	public RegistrarAsistenciaResponseDTO ejecutar(final RegistrarAsistenciaRequestDTO dto) {

		Asistencia asistencia = null; // Obtener asistencia con un mapper desde el DTO

		// Llamar al caso de uso
		var resultadoVo = registrarAsistenciaUseCase.ejecutar(asistencia);

		RegistrarAsistenciaResponseDTO responseDto = null; // Obtener response DTO a partir de el ResponseVO que retorna
															// el caso de uso
		return responseDto;
	}

}
