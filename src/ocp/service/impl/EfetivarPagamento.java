package ocp.service.impl;

import ocp.enums.TipoPagamento;
import ocp.model.DadosParaPagamento;
import ocp.service.Boleto;
import ocp.service.Pagamento;

public class EfetivarPagamento implements Pagamento , Boleto{

    @Override
    public void pagar(TipoPagamento tipo) {
       
        System.out.printf("Processando pagamento :  Tipo %s%n",tipo);
        
    }

    @Override
    public void pagar(DadosParaPagamento dadosPagamento) {
        System.out.println(dadosPagamento);
        
    }
    
}
