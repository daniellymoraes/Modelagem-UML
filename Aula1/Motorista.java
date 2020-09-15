

public class Motorista {
    private String nome;
    private long telefone;
    private String placa;
    private Usuario usuario;

    public Motorista() { }

    public Motorista(String nome, long telefone, String placa, Usuario usuario) {
        this.nome = nome;
        this.placa = placa;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public boolean dirige() {
        return true;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}