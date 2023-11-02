package teste.com.example;

import static org. mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = mock(Autor.class);
    }

    @Test
    public void testGetNome() {
        when(autor.getNome()).thenReturn("J.K. Rowling");
        assertEquals("J.K. Rowling", autor.getNome());
    }

    @Test
    public void testSetNome() {
        autor.setNome("George Orwell");
        verify(autor).setNome("George Orwell");
    }

    @Test
    public void testGetNacionalidade() {
        when(autor.getNacionalidade()).thenReturn("Britânica");
        assertEquals("Britânica", autor.getNacionalidade());
    }

    @Test
    public void testSetNacionalidade() {
        autor.setNacionalidade("Britânica");
        verify(autor).setNacionalidade("Britânica");
    }

    @Test
    public void testAutorToString() {
        when(autor.toString()).thenReturn("Autor: J.K. Rowling, Nacionalidade: Britânica");
        assertEquals("Autor: J.K. Rowling, Nacionalidade: Britânica", autor.toString());
    }
}