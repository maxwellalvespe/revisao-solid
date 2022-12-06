package ocp.service;

import ocp.enums.TipoDeChave;

public interface Pix {

    void pagar(TipoDeChave tipoDeChave , String chave);

    
}
