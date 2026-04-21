package unicauca.edu.co.ms_gestion_maticula.domain.ports.In;

import java.util.List;

import unicauca.edu.co.ms_gestion_maticula.domain.request.MaterialApoyoRequest;
import unicauca.edu.co.ms_gestion_maticula.domain.response.MaterialApoyoResponse;

public interface MaterialApoyoService {
    MaterialApoyoResponse crear(MaterialApoyoRequest request);
    MaterialApoyoResponse actualizar(Integer id, MaterialApoyoRequest request);
    void eliminar(Integer id);
    MaterialApoyoResponse obtener(Integer id);
    List<MaterialApoyoResponse> listar();
}
