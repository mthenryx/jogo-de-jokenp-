package br.senai.sp.jandira.ds1t.jokenpô.model;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenpô {

    int jogadaDoPc;
    int jogadaDoUser;
    String respostaDoPc;
    String respostaDoUser;
    String resultado;
    String comparacao;
    
    public void obterDados (){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("     **Vamos jogar Jokenpô?**     ");
        System.out.println("------------------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("     (1) Pedra!");
        System.out.println("     (2) Papel!");
        System.out.println("     (3) Tesoura!");
        System.out.println("------------------------------------");
        System.out.print("Digite a sua escolha: ");
        jogadaDoUser = leitor.nextInt();

        selecionarJogadaDoUser();
    }
    
    public void selecionarJogadaDoUser (){
        if (jogadaDoUser == 1) {
            respostaDoUser = "Pedra";
        } else if (jogadaDoUser == 2) {
            respostaDoUser = "Papel";
        } else {
            respostaDoUser = "Tesoura";
        }
        
        gerarEscolha();
    }

    public void gerarEscolha () {
        Random random = new Random();
        jogadaDoPc = random.nextInt(3) + 1;

        selecionarJogadaDoPc();
    }

    public void selecionarJogadaDoPc (){
        if (jogadaDoPc == 1) {
            respostaDoPc = "Pedra";
        } else if (jogadaDoPc == 2) {
            respostaDoPc = "Papel";
        } else {
            respostaDoPc = "Tesoura";
        }

        compararJogadas();
    }

    public void compararJogadas (){
        if (respostaDoUser == "Tesoura" && respostaDoPc == "Papel") {
            comparacao = "Você ganhou";
        }else if (respostaDoUser == "Pedra" && respostaDoPc == "Tesoura") {
            comparacao = "Você ganhou";
        }else if (respostaDoUser == "Papel" && respostaDoPc == "Pedra") {
            comparacao = "Você ganhou";
        }else if (respostaDoUser == "Papel" && respostaDoPc == "Tesoura") {
            comparacao = "Computador ganhou";
        } else if (respostaDoUser == "Tesoura" && respostaDoPc == "Pedra") {
            comparacao = "Computador ganhou";
        }else if (respostaDoUser == "Pedra" && respostaDoPc == "Papel") {
            comparacao = "Computador ganhou";
        }else {
            comparacao = "Empate";
        }

        animarJogadas();
    }

    public void animarJogadas (){
        if (comparacao == "Computador ganhou"){
            resultado = " _____________________\n" +
                    "|  _________________  |\n" +
                    "| |                 | |\n" +
                    "| |    Game Over    | |\n" +
                    "| |_________________| |\n" +
                    "|  ___ ___ ___   ___  |\n" +
                    "| | 7 | 8 | 9 | | + | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | 4 | 5 | 6 | | - | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | 1 | 2 | 3 | | * | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | . | 0 | = | | / | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "|_____________________|\n";
        }else if (comparacao == "Você ganhou"){
            resultado = " _____________________\n" +
                    "|  _________________  |\n" +
                    "| |                 | |\n" +
                    "| |   Você Ganhou   | |\n" +
                    "| |_________________| |\n" +
                    "|  ___ ___ ___   ___  |\n" +
                    "| | 7 | 8 | 9 | | + | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | 4 | 5 | 6 | | - | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | 1 | 2 | 3 | | * | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | . | 0 | = | | / | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "|_____________________|\n";
        }else {
            resultado = " _____________________\n" +
                    "|  _________________  |\n" +
                    "| |                 | |\n" +
                    "| |     Empate      | |\n" +
                    "| |_________________| |\n" +
                    "|  ___ ___ ___   ___  |\n" +
                    "| | 7 | 8 | 9 | | + | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | 4 | 5 | 6 | | - | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | 1 | 2 | 3 | | * | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "| | . | 0 | = | | / | |\n" +
                    "| |___|___|___| |___| |\n" +
                    "|_____________________|\n";
        }

        exibirResultados();
    }

    public void exibirResultados (){
        System.out.println("Sua jogada: " + respostaDoUser);
        System.out.println("Jogada do Computador: " + respostaDoPc);
        System.out.println("Resultado: " + comparacao);
        System.out.println(resultado);
    }
}
