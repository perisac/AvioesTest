package aplicacao;

import java.util.List;
import java.util.Scanner;

public class Rota {

    private String aeroportoInicio;
    private String aeroportoFinal;
    private double distancia;
    private Aviao aviao;


    public String getAeroportoInicio() {
        return aeroportoInicio;
    }
    public void setAeroportoInicio(String aeroportoInicio) {
        this.aeroportoInicio = aeroportoInicio;
    }
    public String getAeroportoFinal() {
        return aeroportoFinal;
    }
    public void setAeroportoFinal(String aeroportoFinal) {
        this.aeroportoFinal = aeroportoFinal;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public Aviao getAviao() {
        return aviao;
    }
    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
    public Rota(String aeroportoInicio, String aeroportoFinal, double distancia, Aviao aviao) {
        super();
        this.aeroportoInicio = aeroportoInicio;
        this.aeroportoFinal = aeroportoFinal;
        this.distancia = distancia;
        this.aviao = aviao;
    }

    public Rota(){}

    void listRotas(List<Rota> rotas) {

        for (int i = 0; i < rotas.size(); i++) {
            System.out.println("-------"+i+"--------");
            System.out.println("Início: " + rotas.get(i).getAeroportoInicio());
            System.out.println("Final: " + rotas.get(i).getAeroportoFinal());
            System.out.println("Distancia: " + rotas.get(i).getDistancia());
            System.out.println("Aviao: " + rotas.get(i).getAviao().getNome());
        }
    }

    void addRota(List<Aviao> avioes, List<Rota> rotas) {

        int opc=0;
        Aviao aviao = new Aviao();
        Scanner lt = new Scanner(System.in);
        Rota rota = new Rota();

        System.out.println("Informe o aeroporto inicial:");
        rota.setAeroportoInicio(lt.nextLine());

        System.out.println("Informe o aeroporto final: ");
        rota.setAeroportoFinal(lt.nextLine());

        System.out.println("Informa a distância da rota: ");
        rota.setDistancia(lt.nextDouble());

        do {
            aviao.listAvioes(avioes);
            System.out.println("Selecione o avião da rota: ");
            opc = lt.nextInt();

            if (avioes.get(opc-1).getAutonomiaDistancia() < rota.getDistancia()) {
                System.out.println("O avião selecionado não tem autonomia suficiente!!!!");
            } else {
                rota.setAviao(avioes.get(opc-1));
            }

        } while (avioes.get(opc-1).getAutonomiaDistancia() < rota.getDistancia());

        rota.addRota(avioes, rotas);

    }

    void deletarRota(List<Rota> rotas) {

        Scanner lt = new Scanner (System.in);

        listRotas(rotas);
        System.out.println("Selecione uma rota para excluir");
        int opc = lt.nextInt();

        rotas.remove(opc);
    }
}