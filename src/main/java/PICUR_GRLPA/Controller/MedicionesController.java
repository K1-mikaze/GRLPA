package PICUR_GRLPA.Controller;

import PICUR_GRLPA.Model.Medicion;
import PICUR_GRLPA.Repository.MedicionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class MedicionesController {

    @Autowired
    private MedicionesRepository Mediciones_Repository;

    @GetMapping("/mediciones")
    public List<Medicion> AllMedicion(){
        return Mediciones_Repository.findAll();
    }

    @GetMapping("/mediciones/{id}")
    public Optional<Medicion> Find_By_Id(@PathVariable("id") Long id) {
        return Mediciones_Repository.findById(id);
    }

    @PostMapping("/mediciones")
    public Medicion Create_Medicion(@RequestBody Medicion medicion){
        return Mediciones_Repository.save(medicion);
    }

    @PutMapping("/medicion/{id}")
    public Medicion Update_Medicion(@PathVariable Long id,@RequestBody Medicion medicion){
        return Mediciones_Repository.save(medicion);
    }

    @DeleteMapping("/medicion/{id}")
    public void  Delete_Medicion(@PathVariable("id")Long id){
        Mediciones_Repository.deleteById(id);
    }
}
