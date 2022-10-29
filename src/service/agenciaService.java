package service;

import java.util.List;

public interface agenciaService {
    List<Agencia> list(String nome);
    Agencia save(Agencia agencia);
    Agencia getById(Integer id);
    Agencia update(Integer id, Agencia agencia);
    void delete(Integer id);;
}
