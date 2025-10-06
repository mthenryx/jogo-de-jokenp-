package br.senai.sp.jandira.ds1t.jokenpô;

import br.senai.sp.jandira.ds1t.jokenpô.model.JogoJokenpô;
import java.util.Scanner;

public class JokenpôApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jogarNovamente;

        do {
            System.out.println("Executando Jogo...");

            JogoJokenpô jokenpo = new JogoJokenpô();
            jokenpo.obterDados();

            System.out.print("\nQuer jogar novamente? (s/n): ");
            jogarNovamente = scanner.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Obrigado por jogar! 👋");
        scanner.close();
    }
}
