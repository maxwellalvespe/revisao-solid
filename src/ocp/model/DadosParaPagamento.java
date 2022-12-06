package ocp.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DadosParaPagamento {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String numeroDoTitulo;
    private String credor;
    private String pagador;
    private BigDecimal valorDoDocumento;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;

    public DadosParaPagamento(String numero, String credor, String pagador, BigDecimal valor, LocalDate vencimento) {
        this.numeroDoTitulo = numero;
        this.credor = credor;
        this.pagador = pagador;
        this.valorDoDocumento = valor;
        this.dataVencimento = vencimento;
        this.dataPagamento = LocalDate.now();
    }

    public String getCredor() {
        return credor;
    }

    public String getDataPagamento() {
        return dataPagamento.format(formatter);
    }

    public String getDataVencimento() {
        return dataVencimento.format(formatter);
    }

    public String getNumeroDoTitulo() {
        return numeroDoTitulo;
    }

    public String getPagador() {
        return pagador;
    }

    public BigDecimal getValorDoDocumento() {
        return valorDoDocumento;
    }

    @Override
    public String toString() {
        return String.format("Nº Titulo: %s Credor: %s | Data Pagamento: %s   |",getNumeroDoTitulo(),getCredor(), getDataPagamento());
    }

}
