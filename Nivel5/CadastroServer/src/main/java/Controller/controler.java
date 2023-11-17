public class UserController {

    // Método para cadastrar um novo usuário
    public void cadastrarUsuario(String nome, String email, String senha) {
        System.out.println("Novo usuário cadastrado:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
    }

    public void buscarUsuarioPorId(int userId) {
        System.out.println("Buscando usuário com ID: " + userId);
    }


    public static void main(String[] args) {
        // Exemplo de utilização do controlador
        UserController controller = new UserController();
        controller.cadastrarUsuario("Exemplo", "exemplo@email.com", "senha123");
        controller.buscarUsuarioPorId(1);
    }
}