package srp.service.impl;

import srp.service.Permissao;

public class Financeiro implements Permissao{

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
        return false;
    }

    @Override
    public boolean inserir() {
        return true;
    }
    
}
