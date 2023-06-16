package gerencia.auto.mecanica;
import java.util.Scanner;
public class OrdemServiço extends Cliente{
    Scanner input = new Scanner(System.in);
    public String DataEntrada;
    public String DataEntrega;
    private double Custo;

    public OrdemServiço(String DataEntrada, String DataEntrega, double Custo, String name, String CPF, String fone, String logradouro, String veiculo, String Placa, String cor) {
        super(name, CPF, fone, logradouro, veiculo, Placa, cor);
        this.DataEntrada = DataEntrada;
        this.DataEntrega = DataEntrega;
        this.Custo = Custo;
    }

    public String getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(String DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(String DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    public double getCusto() {
        return Custo;
    }

    public void setCusto(double Custo) {
        this.Custo = Custo;
    }
    
    //Metodo
    public void RegistrarEntrada(){
       System.out.println("Qual horario de entrada?");
       this.DataEntrada = input.nextLine();
    }
    public void RegistrarPrevisao(){
        System.out.println("Qual a data de entrega?");
        this.DataEntrega = input.nextLine();
    }
}
