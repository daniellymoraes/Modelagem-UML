public class Usuario {
    private String nome;
    private long telefone;
    private double latitude;
    private double longitude;

    public Usuario () { }

    public Usuario (String nome, long telefone, 
                        double latitude, double longitude) { 
        this.nome = nome;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;                    
    }

    public boolean pagar(double valor) {
        return valor > 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return this.telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    public double getLatitue() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

} 