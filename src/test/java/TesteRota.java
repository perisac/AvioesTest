import aplicacao.Aviao;
import aplicacao.Rota;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TesteRota {

    @Test
    public void criarRota(){

        Aviao aviao = new Aviao();
        aviao.setAnoFabricacao(2000);
        aviao.setCapacidade(2000);
        aviao.setAutonomiaDistancia(3000);
        aviao.setNome("Boeing 777");
        aviao.setVelocidadeMax(500);

        List<Rota> rotas = new ArrayList<>();
        Rota rota = new Rota();
        rota.setAeroportoInicio("PMW");
        rota.setAeroportoFinal("GYN");
        rota.setDistancia(800);
        rota.setAviao(aviao);
    }
}
