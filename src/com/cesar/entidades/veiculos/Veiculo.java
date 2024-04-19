package com.cesar.entidades.veiculos;

import java.time.LocalDateTime;

public class Veiculo {
    //atributos
    String marca;
    String modelo;
    String fatorEstacionamento;
    LocalDateTime horaEntrada;
    String placa;
    LocalDateTime horaSaida;
    double totalEstacionamento;

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
}
