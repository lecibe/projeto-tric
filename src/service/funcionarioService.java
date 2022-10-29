package service;

import java.util.List;

public interface funcionarioService {
    List<Funcionario> list(String name);
    Funcionario save(Funcionario funcionario);
    Funcionario getById(Long id);
    Funcionario update(Long id, Funcionario funcionario);
    void delete(Long id);
}
