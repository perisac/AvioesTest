package aplicacao;

import java.util.List;
import java.util.Scanner;

public class Aviao {

    private String nome;
    private int capacidade;
    private double velocidadeMax;
    private double autonomiaDistancia;
    private int anoFabricacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getAutonomiaDistancia() {
        return autonomiaDistancia;
    }

    public void setAutonomiaDistancia(double autonomiaDistancia) {
        this.autonomiaDistancia = autonomiaDistancia;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Aviao [nome=" + nome + ", capacidade=" + capacidade + ", velocidadeMax=" + velocidadeMax
                + ", autonomiaDistancia=" + autonomiaDistancia + ", anoFabricacao=" + anoFabricacao + "]";
    }

    public Aviao(String nome, int capacidade, double velocidadeMax, double autonomiaDistancia, int anoFabricacao) {
        super();
        this.nome = nome;
        this.capacidade = capacidade;
        this.velocidadeMax = velocidadeMax;
        this.autonomiaDistancia = autonomiaDistancia;
        this.anoFabricacao = anoFabricacao;
    }

    public Aviao(){};

    public void listAvioes(List<Aviao> avioes) {

        for (int i = 0; i < avioes.size(); i++) {
            System.out.println("-------"+i+"--------");
            System.out.println("Nome: "+ avioes.get(i).getNome());
            System.out.println("Capacidade: "+ avioes.get(i).getCapacidade());
            System.out.println("Velocidade Máx: "+ avioes.get(i).getVelocidadeMax()+ " km/h");
            System.out.println("Autonomia : "+ avioes.get(i).getAutonomiaDistancia()+ " km");
            System.out.println("Ano de Fabricaçao : "+ avioes.get(i).getAnoFabricacao());
            System.out.println("------------------------------------------------------");
        }
    }

    public Aviao cadastrarAviao(List<Aviao> avioes) {

        Aviao aviao = new Aviao();
        Scanner lt = new Scanner(System.in);

        System.out.println("Informe o nome do avião:");
        aviao.setNome(lt.nextLine());

        System.out.println("Informe a capacidade do avião:");
        aviao.setCapacidade(lt.nextInt());

        System.out.println("Informe a velocidade máxima do avião:");
        aviao.setVelocidadeMax(lt.nextDouble());

        System.out.println("Informe a autonomia do avião:");
        aviao.setAutonomiaDistancia(lt.nextDouble());

        System.out.println("Informe o ano de fabricação do avião:");
        aviao.setAnoFabricacao(lt.nextInt());

        avioes.add(aviao);

        return aviao;
    }

    public Aviao atualizarAviao(List<Aviao> avioes) {

        int opc=0;
        Scanner lt = new Scanner(System.in);
        listAvioes(avioes);

        System.out.println("Informe o avião para atualizar: ");
        opc = lt.nextInt();

        System.out.println("Informe o nome do avião:");
        avioes.get(opc).setNome(lt.nextLine());

        System.out.println("Informe a capacidade do avião:");
        avioes.get(opc).setCapacidade(lt.nextInt());

        System.out.println("Informe a velocidade máxima do avião:");
        avioes.get(opc).setVelocidadeMax(lt.nextDouble());

        System.out.println("Informe a autonomia do avião:");
        avioes.get(opc).setAutonomiaDistancia(lt.nextDouble());

        System.out.println("Informe o ano de fabricação do avião:");
        avioes.get(opc).setAnoFabricacao(lt.nextInt());

        return avioes.get(opc);
    }

    public void deletarAviao(List<Aviao> avioes) {

        Scanner lt = new Scanner(System.in);
        listAvioes(avioes);

        System.out.println("Selecione um avião para deletar");
        avioes.remove(lt.nextInt());

    }
}