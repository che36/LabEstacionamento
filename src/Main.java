import com.cesar.entidades.Estacionamento;
import com.cesar.entidades.TipoVeiculo;
import com.cesar.entidades.veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculoList = new ArrayList<>();
        Veiculo utilitario = new Veiculo();

        utilitario.setTipoVeiculo(TipoVeiculo.UTILITARIO);
        Estacionamento estacionamento = new Estacionamento();

        veiculoList.add(utilitario);
        estacionamento.setVeiculos(veiculoList);

        System.out.println(estacionamento.getVeiculos().get(0).getTipoVeiculo());

    }
}