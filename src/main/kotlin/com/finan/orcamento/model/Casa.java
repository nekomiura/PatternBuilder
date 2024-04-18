package com.finan.orcamento.model;

public class Casa {
    private int quartos;
    private int banheiro;
    private boolean churrasqueira;

    private Casa(int quartos, int banheiro, boolean churrasqueira) {
        this.quartos = quartos;
        this.banheiro = banheiro;
        this.churrasqueira = churrasqueira;
    }


    public int getQuartos() {
        return quartos;
    }

    public int getBanheiro() {
        return banheiro;
    }

    public boolean hasChurrasqueira() {
        return churrasqueira;
    }

    // Builder class
    public static class CasaBuilder {
        private int quartos;
        private int banheiro;
        private boolean churrasqueira;

        public CasaBuilder setQuartos(int quartos) {
            this.quartos = quartos;
            return this;
        }

        public CasaBuilder setBanheiro(int banheiro) {
            this.banheiro = banheiro;
            return this;
        }

        public CasaBuilder setChurrasqueira(boolean churrasqueira) {
            this.churrasqueira = churrasqueira;
            return this;
        }

        public Casa build() {
            return new Casa(quartos, banheiro, churrasqueira);
        }
    }
}