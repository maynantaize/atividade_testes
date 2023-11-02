package teste.com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Livro livro;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        livro = mock(Livro.class);
        cliente = mock(Cliente.class);
    }

    @Test
    public void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro);
        assertEquals(1, biblioteca.getLivros().size());
    }

    @Test
    public void testRegistrarCliente() {
        biblioteca.registrarCliente(cliente);
        assertEquals(1, biblioteca.getClientes().size());
    }

    @Test
    public void testGetLivros() {
        List<Livro> livros = new ArrayList<>();
        livros.add(livro);
        livros.add(livro);
        livros.add(livro);
        for (Livro l : livros) {
            biblioteca.adicionarLivro(l);
        }
        assertEquals(3, biblioteca.getLivros().size());
    }

    @Test
    public void testGetClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente);
        clientes.add(cliente);
        for (Cliente c : clientes) {
            biblioteca.registrarCliente(c);
        }
        assertEquals(3, biblioteca.getClientes().size());
    }

    @Test
    public void testBuscarLivroPorISBN() {
        when(livro.getIsbn()).thenReturn("1234567890");
        biblioteca.adicionarLivro(livro);
        Livro encontrado = biblioteca.getLivros().stream()
            .filter(l -> "1234567890".equals(l.getIsbn()))
            .findFirst()
            .orElse(null);
        assertNotNull(encontrado);
        assertEquals("1234567890", encontrado.getIsbn());
    }
}