package br.com.ifgoiano.ed1.estruturas;

import br.com.ifgoiano.ed1.estruturas.pilha.Pilha;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {

    private Pilha pilha;

    @BeforeEach
    void setUp() {
        pilha = new Pilha(3);
    }

    @Test
    void novaPilhaEstaVazia() {
        assertTrue(pilha.vazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    void empilharEDesempilharRespeitaLifo() throws Exception {
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        assertEquals(3, pilha.tamanho());
        assertEquals(30, pilha.desempilhar());
        assertEquals(20, pilha.desempilhar());
        assertEquals(10, pilha.desempilhar());
        assertTrue(pilha.vazia());
    }

    @Test
    void elementoUnico() throws Exception {
        pilha.empilhar(42);

        assertFalse(pilha.vazia());
        assertEquals(1, pilha.tamanho());
        assertEquals(42, pilha.desempilhar());
        assertTrue(pilha.vazia());
    }

    @Test
    void desempilharPilhaVaziaLancaExcecao() {
        assertThrows(Exception.class, pilha::desempilhar);
    }

    @Test
    void empilharPilhaCheiaLancaExcecao() throws Exception {
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);

        assertTrue(pilha.cheia());
        assertThrows(Exception.class, () -> pilha.empilhar(4));
    }
}
