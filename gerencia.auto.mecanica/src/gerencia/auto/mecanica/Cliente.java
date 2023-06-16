package gerencia.auto.mecanica;

import java.util.Scanner;
public class Cliente extends Pessoa{
    private String veiculo;
    private String Placa;
    private String cor;

    public Cliente(String name, String CPF, String fone, String logradouro, String veiculo, String Placa, String cor) {
        super(name, CPF, fone, logradouro);
        
        this.veiculo = veiculo;
        this.Placa = Placa;
        this.cor = cor;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
} 