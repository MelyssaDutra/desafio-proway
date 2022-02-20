package com.melyssa.desafio.proway;

import com.melyssa.desafio.proway.cli.ProcessArgs;
import com.melyssa.desafio.proway.exercicio.Run;

public class Main {

    /**
     * Metodo main static, metodo principal da aplicação
     * caso venhas argumentos na execução a aplicação ira tratra os argumentos e execuar os camonados passados
     *
     * @param args argumentos que poder ser informado na executa do programa pela IDE ou linha de propret de comando
     */
    public static void main(String[] args) {
        /**
         * Metodo exeucuta os args caso venha argumentos ou irá executar o que voce modificado dentro do bloco else
         */
        if (args.length > 0) {
            new ProcessArgs().process(args);
        } else {
            // Aqui é que chamamos os metodos pertinentes

            Run run = new Run();// Criar Objeto responsavel bom absttrair a execução dos Questões

           run.all(); // Executar todas as quetões com valores default com base no enuciando
//            run.all(10, "tyteetor", "ifailuhkqq"); // Executar todas as questões com valores de entrada
//
//            run.escada(); // executa a questão com valor default conforme enuciado
//            run.escada(10); // Executar todas as questões com valores de entrada
//
//            run.senha(); // executa a questão com valor default conforme enuciado
//            run.senha("Htgg"); // Executar todas as questões com valores de entrada
//
//            run.anagrama(); // executa a questão com valor default conforme enuciado
//            run.anagrama("JoofgttHf"); // Executar todas as questões com valores de entrada
        }
    }
}
