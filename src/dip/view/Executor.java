package dip.view;

import dip.service.Leitura;
import dip.service.impl.Pdf;
import dip.service.impl.Texto;

public class Executor {
    public static void main(String[] args) throws Exception {

        new Thread(() -> {
            Leitura leitor = new Texto();
            leitor.ler();

            System.out.println("O Leitor deseja visualizar um preview do livro XPTO em formato pdf.");
            try {
                Thread.sleep(1000);
                leitor = new Pdf();
                leitor.ler();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
}
