package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);
        List<Aviao> avioes = new ArrayList<>();
        List<Rota> rotas = new ArrayList<>();
        Aviao aviao = new Aviao();
        Rota rota = new Rota();
        int opc=0;
        int opcAviao=0;
        int opcRota=0;

        do {
            System.out.println("---------------Menu------------");
            System.out.println("1- Acessar menu de Aviões");
            System.out.println("2- Acessar menu de Rotas");
            System.out.println("3- Sair");
            opc=lt.nextInt();

            if (opc==1) {
                do {
                    System.out.println("-----Menu Aviões");
                    System.out.println("1-Listar aviões");
                    System.out.println("2-Adicionar avião");
                    System.out.println("3-Atualizar avião");
                    System.out.println("4-Deletar avião");
                    System.out.println("5-Voltar");
                    opcAviao = lt.nextInt();

                    if (opcAviao==1) {
                        aviao.listAvioes(avioes);
                    }

                    else if (opcAviao==2) {
                        aviao.cadastrarAviao(avioes);
                    }

                    else if (opcAviao==3) {
                        aviao.atualizarAviao(avioes);
                    }

                    else if (opcAviao==4) {
                        aviao.deletarAviao(avioes);
                    }

                    else if(opcAviao>5) {
                        System.out.println("Opção Inválida!");
                    }


                } while (opcAviao!=5);
            }

            else if(opc==2) {
                do {
                    System.out.println("-----Menu Rotas");
                    System.out.println("1-Listar rotas");
                    System.out.println("2-Adicionar rotas");
                    System.out.println("3-Deletar rotas");
                    System.out.println("4-Sair");
                    opcRota=lt.nextInt();

                    if (opcRota==1) {
                        rota.listRotas(rotas);
                    }

                    else if (opcRota==2) {
                        rota.addRota(avioes, rotas);
                    }

                    else if (opcRota==3) {
                        rota.deletarRota(rotas);
                    }

                    else {
                        System.out.println("Selecione uma opção válida");
                    }

                    lt.next();

                } while (opcRota!=4);
            }


        } while (opc!=3);


    }

}
