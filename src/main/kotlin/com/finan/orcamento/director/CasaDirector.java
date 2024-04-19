package com.finan.orcamento.director;

import com.finan.orcamento.model.Casa;

public class CasaDirector {
    public Casa constructCasa(int quartos, int banheiro, boolean churrasqueira) {
        return new Casa.CasaBuilder()
                .setQuartos(quartos)
                .setBanheiro(banheiro)
                .setChurrasqueira(churrasqueira)
                .build();
    }
}
