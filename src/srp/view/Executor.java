package srp.view;

import srp.model.DepartamentoAdministrativo;
import srp.model.Funcionario;
import srp.service.Permissao;
import srp.service.impl.Administrativo;
import srp.service.impl.Financeiro;

public class Executor {

    public static void main(String[] args) {
        Permissao permissao = new Financeiro();

        System.out.println("o setor adm possue permissão para inserir ? "+permissao.inserir());
        System.out.println("o setor adm possue permissão para atualizar ? "+permissao.editar());
        System.out.println("o setor adm possue permissão para remover ? "+permissao.remover());


        Funcionario funcionario = Funcionario.of("Maxwell", 2500);
        DepartamentoAdministrativo adm = new DepartamentoAdministrativo(funcionario);

        System.out.printf("O Funcionário %s possui acesso para inserir ? %b %n",adm.getFuncionario().getNome(),adm.inserir());

    }

}
