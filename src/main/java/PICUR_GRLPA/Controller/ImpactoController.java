package PICUR_GRLPA.Controller;

import PICUR_GRLPA.Model.Impacto;
import PICUR_GRLPA.Repository.ImpactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class ImpactoController {

    @Autowired
    private ImpactoRepository Impacto_Repository;

    @GetMapping("/impactos")
    public List<Impacto> AllImpactos(){
        return Impacto_Repository.findAll();
    }

    @GetMapping("/impacto/{id}")
    public Optional<Impacto> Find_By_Id(@PathVariable("id") Long id) {
        return Impacto_Repository.findById(id);
    }

    @PostMapping("/impacto")
    public Impacto Create_Impacto(@RequestBody Impacto impacto){
        return Impacto_Repository.save(impacto);
    }

    @PutMapping("/impacto/{id}")
    public Impacto Update_Impacto(@PathVariable Long id,@RequestBody Impacto impacto){
        return Impacto_Repository.save(impacto);
    }

    @DeleteMapping("/impacto/{id}")
    public void  Delete_Impacto(@PathVariable("id")Long id){
        Impacto_Repository.deleteById(id);
    }

}
