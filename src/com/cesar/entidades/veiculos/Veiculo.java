package com.cesar.entidades.veiculos;

import com.cesar.entidades.TipoVeiculo;

import java.time.LocalDateTime;

public class Veiculo {
    //atributos
    private String marca;
    private String modelo;
    private String fatorEstacionamento;
    private LocalDateTime horaEntrada;
    private String placa;
    private LocalDateTime horaSaida;
    private double totalEstacionamento;
    private TipoVeiculo tipoVeiculo;

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(String fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTotalEstacionamento() {
        return totalEstacionamento;
    }

    public void setTotalEstacionamento(double totalEstacionamento) {
        this.totalEstacionamento = totalEstacionamento;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
