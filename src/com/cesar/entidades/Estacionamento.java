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

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void setTotalFaturamento(double totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }

    public double getTotalFaturamentoCarro() {
        return totalFaturamentoCarro;
    }

    public void setTotalFaturamentoCarro(double totalFaturamentoCarro) {
        this.totalFaturamentoCarro = totalFaturamentoCarro;
    }

    public double getTotalFatutamentoMoto() {
        return totalFatutamentoMoto;
    }

    public void setTotalFatutamentoMoto(double totalFatutamentoMoto) {
        this.totalFatutamentoMoto = totalFatutamentoMoto;
    }

    public double getTotalFaturamentoUtilitario() {
        return totalFaturamentoUtilitario;
    }

    public void setTotalFaturamentoUtilitario(double totalFaturamentoUtilitario) {
        this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
    }
}
