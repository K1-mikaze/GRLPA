package PICUR_GRLPA.Controller;

import PICUR_GRLPA.Model.Accion;
import PICUR_GRLPA.Repository.AccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class AccionController {

    @Autowired
    private AccionRepository Accion_Repository;

    @GetMapping("/accions")
    public List<Accion> AllAccions(){
        return Accion_Repository.findAll();
    }

    @GetMapping("/accion/{id}")
    public Optional<Accion> Find_By_Id(@PathVariable("id") Long id) {
        return Accion_Repository.findById(id);
    }

    @PostMapping("/accion")
    public Accion Create_Accion(@RequestBody Accion accion){
        return Accion_Repository.save(accion);
    }

    @PutMapping("/accion/{id}")
    public Accion Update_Accion(@PathVariable Long id,@RequestBody Accion accion){
        return Accion_Repository.save(accion);
    }

    @DeleteMapping("/accion/{id}")
    public void  Delete_Accion(@PathVariable("id")Long id){
        Accion_Repository.deleteById(id);
    }

}
