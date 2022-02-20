package com.melyssa.desafio.proway.exercicio;

/**
 * Class que organizará a execução dos exercico, metodos que possuem valores default ou com strings informadas
 */
public class Run {

    /**
     * Metudo que executa a questão 01 com valor default e mostra no console
     */
    public void escada() {
        new Escada().montarEscada(6);
    }

    /**
     * Metodo que executar o questão 01 com o porcesameto da quantidade de degraus inofrmado
     *
     * @param tamanho quantidade de degraus que a escada terá
     */
    public void escada(int tamanho) {
        new Escada().montarEscada(tamanho);
    }

    /**
     * Metodo que executa a questão 02 com os valores default e mostra o resulado no console
     *
     * @return
     */
    public RetornoSenha senha() {
        return new Senha().validarSenha("Skk#dfi$4");
    }

    /**
     * Metodo que irá verificar se a senha informa esta de acordo com as regras de segurança
     *
     * @param s entrada da senha que será verificada
     * @return retorno uma class com as informações da senha
     */
    public RetornoSenha senha(String s) {
        return new Senha().validarSenha(s);
    }

    /**
     * Metodo que executa a questão 03 com valores default e mostra o resultado no conssole
     */
    public void anagrama() {
        Anagrama.executar("ifailuhkqq");
    }

    /**
     * Metodo de executa o processamento da string informada
     *
     * @param value entrada com a string que será analizada
     */
    public void anagrama(String value) {
        Anagrama.executar(value);
    }

    /**
     * metodo que executa todos exercicios com valores default
     */
    public void all() {
        System.out.println("----------- Executar Todas as Questões -----------------");
        escada();
        senha();
        anagrama();
        System.out.println();
        System.out.println("----------- FIM ----------------------------------------\n");
    }

    /**
     * Metodo que executa todos exercicios com as entradas dos valores
     *
     * @param tamanhoEscada informa quantos degraus a escada possue
     * @param s             informa a senha para ser analizada
     * @param palavra       informa a string que será analizar se tem anagrama
     */
    public void all(int tamanhoEscada, String s, String palavra) {
        System.out.println("----------- Executar Todas as Questões -----------------");
        escada(tamanhoEscada);
        senha(s);
        anagrama(palavra);
        System.out.println();
        System.out.println("----------- FIM ----------------------------------------");
    }

}
