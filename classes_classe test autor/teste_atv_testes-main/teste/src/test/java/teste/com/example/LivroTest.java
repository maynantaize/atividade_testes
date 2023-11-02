package teste.com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LivroTest {

    private Livro livro;
    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = mock(Autor.class);
        livro = new Livro("1984", autor, "1234567890");
    }

    @Test
    public void testGetTitulo() {
        assertEquals("1984", livro.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        livro.setTitulo("Animal Farm");
        assertEquals("Animal Farm", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testSetAutor() {
        Autor outroAutor = mock(Autor.class);
        livro.setAutor(outroAutor);
        assertSame(outroAutor, livro.getAutor());
    }

    @Test
    public void testIsEmprestado() {
        assertFalse(livro.isEmprestado());
        livro.setEmprestado(true);
        assertTrue(livro.isEmprestado());
    }
}
