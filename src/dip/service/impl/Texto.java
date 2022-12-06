package dip.service.impl;

import dip.service.Leitura;

public class Texto implements Leitura{
    

    @Override
    public void ler() {
        System.out.println("Lendo arquivo txt.");
    }
}
