/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetointegrador;

import java.util.Scanner;



/**
 *
 * @author Paola Soares
 */
public class ProgetoIntegrador {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nOlá: Está preparado pra essa missãao... ?");
        System.out.println("\n1 - Sim |2 - Não sei ");
        int escolha_menu = entrada.nextInt();
        switch (escolha_menu) {
            case 1:
                System.out.println("Então vamos lá...");
                menu();
                break;
            case 2:
                System.out.println("É meu jovem, precisamos de jovem mais corajoso pra se juntar a nós nessa missão.");
                break;
            default:
                System.out.println("Ops: opção inválida");
                break;
        }

    }

    static void menu() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu = 0;
        do {
            System.out.println("\n\n..:: Mundo de CAMANAPA ::.. \n\n1 - Instruções \n2 - Jogar \n3 - História \n4 Créditos \n5 - Sair");
            System.out.println("\n");
            escolha_menu = entrada.nextInt();
            switch (escolha_menu) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    jogo();
                    break;
                case 3:
                    historia();
                    break;
                case 4:
                    creditos();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida, digite novamente: ");
                    break;
            }

        } while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4 && escolha_menu != 5);

    }

    static void instrucoes() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu = 0;
        do {
            System.out.println("Você escolheu a opção Instruções: ");

            System.out.println("\nEscolha JOGAR para iniciar ou HISTÓRIA para ler a história do mundo de CAMANAPA. ");
            System.out.println("\nO jogo consiste em 7 desafios baseados na matéria Conceitos de Computação, ou seja, você terá de responder perguntas envolvendo conversão de base, mapa de Karnaugh etc.");
            System.out.println("\nAo acertar, pressione ENTER para continuar. Ao errar, pressione ENTER para tentar novamente. ");
            System.out.println("\nVocê possui 3 vidas, logo, pode errar 3 vezes durante o jogo. Caso você perca todas as vidas, de volta ao início. ");
            System.out.println("\nAcerte todas as perguntas com o mínimo de erros para vencer! Boa sorte!");
            System.out.println("1 - sair ");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 1) {
                menu();
            } else {
                System.out.println("Opção Inválida");
            }
        } while (escolha_menu != 1);
    }

    static void jogo() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int resp;
        System.out.println("BEM - VINDO A CANAMAPA !");
        System.out.println("\n");

        System.out.println("É, é isso mesmo que você ouviu, você está CANAMAPA. Quem sou eu?\n Isso não interessa, me diga quem é você,  qual seu nome?");
        System.out.println("\n");

        System.out.println("Insira o nome:");
        String nome = entrada.next();

        System.out.println("Ótimo, " + nome + ". Vamos lá, vou resumir a história pra você. Você está preso em meu mundo,\n e enquanto não cumprir minhas missões, viverá aqui para sempre! Divirta-se nos meus diversos biomas... se puder.");
        System.out.println("\n");

    }
        
        
    static void historia() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu = 0;
        do {
            System.out.println("Seja bem-vindo à CANAMAPA ");

            System.out.println("\nHá muito tempo, em uma galáxia distante... Existia a terra de Camanapa. ");
            System.out.println("\nSeu nome se deu em homenagem aos seus guardiões e desenvolvedores, conhecidos por suas iniciais Ca, Ma, Na e Pa, possuindo, respectivamente, os poderes do Ar, da Água, do Fogo e da Terra.");
            System.out.println("\nUnidos, possuíam também poderes tecnológicos para que Camanapa estivesse em constante evolução. Todos os que ali habitavam aproveitavam o equilíbrio entre natureza e tecnología,\n e passavam suas vidas buscando conhecimento para que esse equilíbrio fosse mantido e aprimorado. ");
            System.out.println("\nPorém, lideranças de diferentes partes do planeta buscavam tomar esse poder das mãos dos guardiões e estabelecer uma nova ordem. Iniciou-se assim a Grande Guerra. ");
            System.out.println("\nLiderados pelo grande Takeo, os mestres das regiões de Java e da Computação travaram uma disputa contra os guardiões de Camanapa, que por serem em menor número, foram derrotados e exilados do planeta.");
            System.out.println("Vagando pelo universo afora, pensando e avaliando soluções para tomar o poder de sua terra de volta, os guardiões decidiram que a melhor pessoa para lidar com a situação e derrotar Takeo seria um grande jogador de RPG.\n Takeo gostava muito de jogos, especialmente RPG, então sua competição para decidir o domínio do planeta girava em torno de um jogo de Conceitos de Computação.");
            System.out.println("Os guardiões, depois de muita pesquisa, descobriram que os grandes jogadores se encontram no planeta Terra.");
            System.out.println("1 - sair ");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 1) {
                menu();
            } else {
                System.out.println("Opção Inválida");
            }
        } while (escolha_menu != 1);

    }

    static void creditos() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu;
        System.out.println("\n\n Desenvolvedores \n\n->  \n-> Paola Soares \n-> RafaelCamilo \n-> Nadine Silva \n-> Maria Carolina");

        do {

            System.out.println("\n1 - Sair");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 1) {
                menu();
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_menu != 1);
    }

}
