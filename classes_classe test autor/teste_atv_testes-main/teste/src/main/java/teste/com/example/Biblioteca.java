package teste.com.example;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Cliente> clientes;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Métodos para adicionar livros e clientes
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Getters
    public List<Livro> getLivros() {
        return livros;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}