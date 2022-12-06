package ocp.view;

import java.math.BigDecimal;
import java.time.LocalDate;

import ocp.enums.TipoDeChave;
import ocp.model.DadosParaPagamento;
import ocp.service.Boleto;
import ocp.service.impl.EfetivarPagamento;


public class Executor {

    public static void main(String[] args) {
        DadosParaPagamento pagamento = new DadosParaPagamento("999999", "Inter", "Maxwell", BigDecimal.valueOf(10500),
                LocalDate.of(2022, 12, 15));

        System.out.println(pagamento.getDataPagamento());
        System.out.println(pagamento.getDataVencimento());

        Boleto bol = new EfetivarPagamento();
        bol.pagar(pagamento);        
        
    }

}
