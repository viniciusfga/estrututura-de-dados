package br.com.ifgoiano.ed1.estruturas;

import br.com.ifgoiano.ed1.estruturas.lista.inteiro.Encadeada;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncadeadaTest {

    private Encadeada lista;

    @BeforeEach
    void setUp() {
        lista = new Encadeada();
    }

    @Test
    void novaListaEstaVazia() throws Exception {
        assertTrue(lista.vazia());
    }

    @Test
    void inserirFimERemoverFim() throws Exception {
        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);

        assertFalse(lista.vazia());
        assertEquals(3, lista.removerFim());
        assertEquals(2, lista.removerFim());
        assertEquals(1, lista.removerFim());
        assertTrue(lista.vazia());
    }

    @Test
    void inserirInicioERemoverInicio() throws Exception {
        lista.inserirInicio(1);
        lista.inserirInicio(2);

        assertEquals(2, lista.removerInicio());
        assertEquals(1, lista.removerInicio());
        assertTrue(lista.vazia());
    }

    @Test
    void elementoUnico() throws Exception {
        lista.inserirFim(99);

        assertEquals(99, lista.buscar(99));
        assertEquals(99, lista.removerInicio());
        assertTrue(lista.vazia());
    }

    @Test
    void removerPorChave() throws Exception {
        lista.inserirFim(10);
        lista.inserirFim(20);
        lista.inserirFim(30);

        assertEquals(20, lista.remover(20));
        assertEquals(10, lista.buscar(10));
        assertEquals(30, lista.buscar(30));
        assertThrows(Exception.class, () -> lista.buscar(20));
    }

    @Test
    void removerInicioListaVaziaLancaExcecao() {
        assertThrows(Exception.class, lista::removerInicio);
    }

    @Test
    void removerChaveInexistenteLancaExcecao() throws Exception {
        lista.inserirFim(1);
        assertThrows(Exception.class, () -> lista.remover(99));
    }

    @Test
    void inserirOrdenadoMantemOrdem() throws Exception {
        lista.inserirOrdenado(30);
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(20);

        assertEquals(10, lista.removerInicio());
        assertEquals(20, lista.removerInicio());
        assertEquals(30, lista.removerInicio());
    }
}
