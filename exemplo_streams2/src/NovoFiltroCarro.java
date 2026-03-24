import java.util.*;
import java.util.function.Predicate;
public class NovoFiltroCarro {
    public Iterable<Carro> filtrar(Iterable<Carro> carros, Predicate<Carro> p) {
        List<Carro> resposta = new ArrayList<>();
        for (Carro c: carros) {
            if (p.test(c)) {
                resposta.add(c);
            }
        }
        return resposta;
    }
}