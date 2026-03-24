import java.util.*;

public class App4 {
    public static void main(String[] args) throws Exception {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("VW", "Gol", "AZUL", 1989));
        carros.add(new Carro("Fiat", "147", "AZUL", 1978));
        carros.add(new Carro("VW", "Polo", "VERDE", 2000));
        carros.add(new Carro("BYD", "Dolphin", "AZUL", 2023));
        carros.add(new Carro("GM", "Onix", "VERDE", 2022));

        FiltroCarro filtro = new FiltroCarro();

        Iterable<Carro> azuis = filtro.filtrar(carros, (Carro c) -> {return c.marca().equals("Fiat");});
        System.out.println(azuis);
    }
}
