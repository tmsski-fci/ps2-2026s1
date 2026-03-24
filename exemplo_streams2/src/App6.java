import java.util.*;

public class App6 {
    public static void main(String[] args) throws Exception {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("VW", "Gol", "AZUL", 1989));
        carros.add(new Carro("Fiat", "147", "AZUL", 1978));
        carros.add(new Carro("VW", "Polo", "VERDE", 2000));
        carros.add(new Carro("BYD", "Dolphin", "AZUL", 2023));
        carros.add(new Carro("GM", "Onix", "VERDE", 2022));

        NovoFiltroCarro filtro = new NovoFiltroCarro();

        Iterable<Carro> azuis = filtro.filtrar(carros, c -> c.ano() > 2000);
        System.out.println(azuis);
    }
}
