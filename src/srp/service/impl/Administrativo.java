package srp.service.impl;

import srp.service.Permissao;

public class Administrativo implements Permissao {

    @Override
    public boolean escrever() {
        return true;
    }

    @Override
    public boolean editar() {
        return true;
    }

    @Override
    public boolean remover() {
        return true;
    }

    @Override
    public boolean inserir() {
        return true;
    }
    
}
