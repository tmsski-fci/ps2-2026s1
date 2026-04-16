package ps2.restdb;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitulosController {

    @Autowired
    private TitulosRepo titulosRepo;

    @GetMapping("/api/titulos")
    public Iterable<Titulo> getTitulos() {
        Iterable<Titulo> titulos = titulosRepo.findAll();
        return titulos;
    }

    @PostMapping("/api/titulos")
    public Titulo createTitulo(@RequestBody Titulo t) {
        return titulosRepo.save(t);
    }

    @PutMapping("/api/titulos/{id}")
    public Titulo updateTitulo(@PathVariable long id, @RequestBody Titulo t) {
        Optional<Titulo> opt = titulosRepo.findById(id);
        if (opt.isEmpty()) return null;
        Titulo titulo = opt.get();
        titulo.setNome(t.getNome());
        titulo.setEsporte(t.getEsporte());
        titulo.setPremio(t.getPremio());
        return titulosRepo.save(titulo);
    }

    @DeleteMapping("/api/titulos/{id}")
    public void deleteTitulo(@PathVariable long id) {
        titulosRepo.deleteById(id);
    }
}
