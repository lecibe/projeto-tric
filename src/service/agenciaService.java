package service;

import java.util.List;

public interface agenciaService {
    List<Agencia> list(String name);
    Agencia save(Agencia agencia);
    Agencia getById(Long id);
    Agencia update(Long id, Agencia agencia);
    void delete(Long id);
}
