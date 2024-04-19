package com.cesar.entidades;

public class Estacionamento {
    //atributos
    double valorHora;
    double totalFaturamento;
    double totalFaturamentoCarro;
    double totalFatutamentoMoto;
    double totalFaturamentoUtilitario;

    public Estacionamento(double valorHora, double totalFaturamento, double totalFaturamentoCarro, double totalFatutamentoMoto, double totalFaturamentoUtilitario) {
        this.valorHora = valorHora;
        this.totalFaturamento = totalFaturamento;
        this.totalFaturamentoCarro = totalFaturamentoCarro;
        this.totalFatutamentoMoto = totalFatutamentoMoto;
        this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
    }
}
