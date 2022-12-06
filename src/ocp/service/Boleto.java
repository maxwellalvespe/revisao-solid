package ocp.service;

import ocp.model.DadosParaPagamento;

public interface Boleto {

    void pagar(DadosParaPagamento dadosPagamento);
    
}
