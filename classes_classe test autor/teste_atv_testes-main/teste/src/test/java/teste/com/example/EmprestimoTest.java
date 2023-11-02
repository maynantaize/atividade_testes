package teste.com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmprestimoTest {

    private Livro livroMock;
    private Cliente clienteMock;
    private Emprestimo emprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    @BeforeEach
    void setUp() {
        // Criação dos mocks
        livroMock = mock(Livro.class);
        clienteMock = mock(Cliente.class);
        dataEmprestimo = LocalDate.now();
        dataDevolucao = LocalDate.now().plusDays(14);

        // Inicialização do objeto Emprestimo com os mocks
        emprestimo = new Emprestimo(livroMock, clienteMock, dataEmprestimo, dataDevolucao);
    }

    @Test
    void testGetLivro() {
        // Ação e Verificação
        assertEquals(livroMock, emprestimo.getLivro(), "O livro retornado deve ser o mesmo que o mock.");
    }

    @Test
    void testSetLivro() {
        // Novo mock para Livro
        Livro novoLivroMock = mock(Livro.class);

        // Ação
        emprestimo.setLivro(novoLivroMock);

        // Verificação
        assertEquals(novoLivroMock, emprestimo.getLivro(), "O livro definido deve ser o mesmo que o novo mock.");
    }

    @Test
    void testGetCliente() {
        // Ação e Verificação
        assertEquals(clienteMock, emprestimo.getCliente(), "O cliente retornado deve ser o mesmo que o mock.");
    }

    @Test
    void testSetCliente() {
        // Novo mock para Cliente
        Cliente novoClienteMock = mock(Cliente.class);

        // Ação
        emprestimo.setCliente(novoClienteMock);

        // Verificação
        assertEquals(novoClienteMock, emprestimo.getCliente(), "O cliente definido deve ser o mesmo que o novo mock.");
    }

    @Test
    void testDataEmprestimo() {
        // Ação
        LocalDate novaDataEmprestimo = LocalDate.now().plusDays(1);
        emprestimo.setDataEmprestimo(novaDataEmprestimo);

        // Verificação
        assertEquals(novaDataEmprestimo, emprestimo.getDataEmprestimo(), "A data de empréstimo deve ser atualizada para a nova data.");
    }

    @Test
    void testDataDevolucao() {
        // Ação
        LocalDate novaDataDevolucao = LocalDate.now().plusDays(21);
        emprestimo.setDataDevolucao(novaDataDevolucao);

        // Verificação
        assertEquals(novaDataDevolucao, emprestimo.getDataDevolucao(), "A data de devolução deve ser atualizada para a nova data.");
    }
}