package gerencia.auto.mecanica;
public abstract class Pessoa {
    public String name;
    private String CPF;
    private String fone;
    private String logradouro;

    public Pessoa(String name, String CPF, String fone, String logradouro){
        this.name = name;
        this.CPF = CPF;
        this.fone = fone;
        this.logradouro = logradouro;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
}

