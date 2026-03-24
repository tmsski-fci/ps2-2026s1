import java.util.*;

class CriterioAzul implements CriterioCarro {
    public boolean verificarCriterio(Carro c) {
        return c.cor().equals("AZUL");
    }
}

public class App1 {
    public static void main(String[] args) throws Exception {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("VW", "Gol", "AZUL", 1989));
        carros.add(new Carro("Fiat", "147", "AZUL", 1978));
        carros.add(new Carro("VW", "Polo", "PRATA", 2000));
        carros.add(new Carro("BYD", "Dolphin", "AZUL", 2023));
        carros.add(new Carro("GM", "Onix", "VERMELHO", 2022));

        FiltroCarro filtro = new FiltroCarro();
        CriterioCarro criterioAzul = new CriterioAzul();
        Iterable<Carro> azuis = filtro.filtrar(carros, criterioAzul);
        System.out.println(azuis);
    }
}
