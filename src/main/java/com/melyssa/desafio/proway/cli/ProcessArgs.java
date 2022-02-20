package com.melyssa.desafio.proway.cli;

import com.melyssa.desafio.proway.exercicio.Run;
import com.melyssa.desafio.proway.exercicio.Util;

public class ProcessArgs {
    /**
     * Metodo que constroi o Help do cli
     *
     * @return reotuna o help
     */
    private String getHelp() {
        StringBuilder builder = new StringBuilder();
        builder.append("Comando para executar Escada\n");
        builder.append("    Q1=default\n");
        builder.append("    ESCADA=default\n");
        builder.append("    E=default\n");
        builder.append("    executar a questão com valores default\n");
        builder.append("");
        builder.append("    ---------------------------------------------------------------\n");
        builder.append("    Q1=6\n");
        builder.append("    ESCADA=6\n");
        builder.append("    E=6\n");
        builder.append("    Informe um valor inteiro, a escada será contruida com a quantidade de degaus informado\n\n");
        builder.append("Comando para executar Senha\n");
        builder.append("    Q2=default\n");
        builder.append("    E=default\n");
        builder.append("    SENHA=default\n");
        builder.append("    executar a questão com senha default\n");
        builder.append("");
        builder.append("    ---------------------------------------------------------------\n");
        builder.append("    Q2=Jllddu\n");
        builder.append("    SENHA=Jllddu\n");
        builder.append("    S=Jllddu\n");
        builder.append("    informa uma senha para ser validada\n\n");
        builder.append("Comando para executar a Anagrama\n");
        builder.append("    Q3=default\n");
        builder.append("    ANAGRAMA=default\n");
        builder.append("    A=default\n");
        builder.append("    executar a questão com senha default\n");
        builder.append("");
        builder.append("    ---------------------------------------------------------------\n");
        builder.append("    Q3=kkddjjuusodfuap\n");
        builder.append("    ANAGRAMA=kkddjjuusodfuap\n");
        builder.append("    A=kkddjjuusodfuap\n");
        builder.append("    ao informa uma palava o sistema ira procurar por anagramas\n");
        return builder.toString();
    }

    private final Run run;

    public ProcessArgs() {
        this.run = new Run();
    }

    private boolean isDefault(String c) {
        c = c.toUpperCase();
        return (c.equals("D") || c.equals("DEFAULT"));
    }

    private String execuarComando(String[] cmd) {
        String erro = "";
        switch (cmd[0].toUpperCase()) {
            case "Q1":
            case "ESCADA":
            case "E":
                if (isDefault(cmd[1])) {
                    run.escada();
                } else {
                    if (Util.verificarSeTemNumero(cmd[1]))
                        try {
                            run.escada(Integer.parseInt(cmd[1]));
                        } catch (Exception e) {
                            erro = cmd[0] + " Valor informado tem que ser um número inteiro e não pode conter (.) e nem (,) veja o help";
                        }
                    else
                        erro = cmd[0] + " Valor informado tem que ser um número inteiro veja o help";
                }
                break;
            case "Q2":
            case "SENHA":
            case "S":
                if (isDefault(cmd[1]))
                    System.out.println(run.senha().toString());
                else
                    System.out.println(run.senha(cmd[1]).toString());
                break;
            case "Q3":
            case "ANAGRAMA":
            case "A":
                if (isDefault(cmd[1]))
                    run.anagrama();
                else
                    run.anagrama(cmd[1]);
                break;
            default:
                erro = "ec";
        }
        return erro;
    }

    public void process(String[] args) {
        String errosArg = "";
        for (String arg : args) {
            if (arg.trim().toUpperCase().equals("HELP")) {
                System.out.println(getHelp());
            } else if (arg.contains("=")) {
                String r = execuarComando(arg.split("="));
                if (!r.isEmpty()) {
                    if (r.equals("ec")) {
                        System.out.println("o comado " + arg + " não é válido veja o help");
                    } else {
                        System.out.println(r);
                    }
                }
            } else {
                if (errosArg.isEmpty()) {
                    errosArg += arg;
                } else {
                    errosArg += "," + arg;
                }
            }
        }

        if (!errosArg.isEmpty()) {
            boolean nErros = errosArg.contains(",");
            System.out.println("Não foi possivel processar" + (nErros ? " os" : " o") + (nErros ? " comandos " : " comando ") + errosArg);
        }
    }
}
