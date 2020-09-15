public class Main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Jose da Silva", 19993154654, 
                                            -123456.45, -123456.65);
        Motorista motorista = new Motorista("Joao de Souza", 19365982364, 
                            "ABC1234", usuario);

        System.out.println("Nome do usuario: " + motorista.getUsuario().getNome());
    }
}