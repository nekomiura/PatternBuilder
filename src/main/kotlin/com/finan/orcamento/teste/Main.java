package com.finan.orcamento.Teste;

import com.finan.orcamento.director.CasaDirector;
import com.finan.orcamento.model.Casa;

public class Main {
    public static void main(String[] args) {
        CasaDirector director = new CasaDirector();

        Casa casa = director.constructCasa(3, 2, true);//3 quartos, 2 banheiros, churrasqueira

        System.out.println("Quartos: " + casa.getQuartos());
        System.out.println("Banheiro: " + casa.getBanheiro());
        System.out.println("Churrasqueira: " + (casa.hasChurrasqueira() ? "Yes" : "No"));
    }
}
