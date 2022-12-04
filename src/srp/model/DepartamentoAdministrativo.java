package srp.model;

import srp.service.impl.Administrativo;

public class DepartamentoAdministrativo extends Administrativo {

    private Funcionario funcionario;

    public DepartamentoAdministrativo(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

}
