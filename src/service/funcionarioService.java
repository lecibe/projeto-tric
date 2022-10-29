package service;

import java.util.List;

public interface funcionarioService {
    List<Funcionario> list(String nome);
    Funcionario save(Funcionario funcionario);
    Funcionario getById(Integer id);
    Funcionario update(Integer id, Funcionario funcionario);
    void delete(Integer id);
}
