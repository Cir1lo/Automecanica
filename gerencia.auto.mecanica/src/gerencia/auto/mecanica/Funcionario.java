package gerencia.auto.mecanica;
public class Funcionario extends Pessoa {
    private String Funcao;
    private String DataDeEntrada;
    private String CargaHoraria;
    private String UsuarioeSenha;
    private double Salario;

    public Funcionario(String Funcao, String DataDeEntrada, String CargaHoraria, String UsuarioeSenha, double Salario, String name, String CPF, String fone, String logradouro) {
        super(name, CPF, fone, logradouro);
        this.Funcao = Funcao;
        this.DataDeEntrada = DataDeEntrada;
        this.CargaHoraria = CargaHoraria;
        this.UsuarioeSenha = UsuarioeSenha;
        this.Salario = Salario;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getDataDeEntrada() {
        return DataDeEntrada;
    }

    public void setDataDeEntrada(String DataDeEntrada) {
        this.DataDeEntrada = DataDeEntrada;
    }

    public String getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(String CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public String getUsuarioeSenha() {
        return UsuarioeSenha;
    }

    public void setUsuarioeSenha(String UsuarioeSenha) {
        this.UsuarioeSenha = UsuarioeSenha;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    
}
