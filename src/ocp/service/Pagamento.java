package ocp.service;

import ocp.enums.TipoPagamento;

public interface Pagamento{

    void pagar(TipoPagamento tipo);
}