package com.melyssa.test;

import com.melyssa.desafio.proway.exercicio.Anagrama;
import com.melyssa.desafio.proway.exercicio.Escada;
import com.melyssa.desafio.proway.exercicio.RetornoSenha;
import com.melyssa.desafio.proway.exercicio.Senha;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteDesafio {

    @Test
    public void testQuestao01() {
        String[] strings = new Escada().montarEscada(6);
        assertEquals(strings[5].trim(), "******");
    }

    @Test
    public void testQuestao02() {
        RetornoSenha senhaForte = new Senha().validarSenha("ssffs%44I");
        assertEquals(senhaForte.isForte(), true);
    }

    @Test
    public void testQuestao03() {
        int q = new Anagrama().executar("ifailuhkqq");
        assertEquals(q, 3);
    }
}
