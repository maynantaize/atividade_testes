package teste.com.example;

import static org. mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = mock(Cliente.class);
    }

    @Test
    public void testGetNome() {
        when(cliente.getNome()).thenReturn("John Doe");
        assertEquals("John Doe", cliente.getNome());
    }

    @Test
    public void testSetNome() {
        cliente.setNome("Jane Doe");
        verify(cliente).setNome("Jane Doe");
    }

    @Test
    public void testGetCpf() {
        when(cliente.getCpf()).thenReturn("123.456.789-00");
        assertEquals("123.456.789-00", cliente.getCpf());
    }

    @Test
    public void testSetCpf() {
        cliente.setCpf("987.654.321-00");
        verify(cliente).setCpf("987.654.321-00");
    }

    @Test
    public void testClienteToString() {
        when(cliente.toString()).thenReturn("Cliente: John Doe, CPF: 123.456.789-00");
        assertEquals("Cliente: John Doe, CPF: 123.456.789-00", cliente.toString());
    }
}