package PICUR_GRLPA.Controller;

import PICUR_GRLPA.Model.Evaluacion;
import PICUR_GRLPA.Repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class EvaluacionController {

    @Autowired
    private EvaluacionRepository Evaluacion_Repository;

    @GetMapping("/evaluaciones")
    public List<Evaluacion> AllEvaluaciones(){
        return Evaluacion_Repository.findAll();
    }

    @GetMapping("/evaluaciones/{id}")
    public Optional<Evaluacion> Find_By_Id(@PathVariable("id") Long id) {
        return Evaluacion_Repository.findById(id);
    }

    @PostMapping("/evaluacion")
    public Evaluacion Create_Evaluacion(@RequestBody Evaluacion evaluacion){
        return Evaluacion_Repository.save(evaluacion);
    }

    @PutMapping("/evaluacion/{id}")
    public Evaluacion Update_Evaluacion(@PathVariable Long id,@RequestBody Evaluacion evaluacion){
        return Evaluacion_Repository.save(evaluacion);
    }

    @DeleteMapping("/evaluacion/{id}")
    public void  Delete_Evaluacion(@PathVariable("id")Long id){
        Evaluacion_Repository.deleteById(id);
    }

}
