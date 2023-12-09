import aplicacao.Aviao;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TesteAviao {

    @Test
    public void cadastrarAviao() {

        Aviao aviao = new Aviao();
        List<Aviao> avioes = new ArrayList<>();

        aviao.setAnoFabricacao(2000);
        aviao.setCapacidade(2000);
        aviao.setAutonomiaDistancia(3000);
        aviao.setNome("Boeing 777");
        aviao.setVelocidadeMax(500);

        avioes.add(aviao);

        Assert.assertEquals(1, avioes.size());
        Assert.assertFalse(avioes.isEmpty());
        Assert.assertEquals(avioes.get(0), aviao);
    }

    @Test
    public void deleteAviao(){

        Aviao aviao = new Aviao();
        List<Aviao> avioes = new ArrayList<>();

        aviao.setAnoFabricacao(2000);
        aviao.setCapacidade(2000);
        aviao.setAutonomiaDistancia(3000);
        aviao.setNome("Boeing 777");
        aviao.setVelocidadeMax(500);

        avioes.add(aviao);

        avioes.remove(0);
        Assert.assertTrue(avioes.isEmpty());
        Assert.assertEquals(0, avioes.size());
    }

    @Test
    public void updateAviao(){

        Aviao aviao = new Aviao();
        Aviao aviao2 = new Aviao();

        List<Aviao> avioes = new ArrayList<>();

        aviao.setAnoFabricacao(2000);
        aviao.setCapacidade(2000);
        aviao.setAutonomiaDistancia(3000);
        aviao.setNome("Boeing 777");
        aviao.setVelocidadeMax(500);

        avioes.add(aviao);

        aviao2.setAnoFabricacao(2020);
        aviao2.setCapacidade(2400);
        aviao2.setAutonomiaDistancia(3000);
        aviao2.setNome("Airbus");
        aviao2.setVelocidadeMax(700);

        avioes.add(0,aviao2);

        Assert.assertEquals(avioes.get(0).getNome(),aviao2.getNome());
        Assert.assertNotEquals(avioes.get(0).getVelocidadeMax(), aviao.getVelocidadeMax());
    }
}
