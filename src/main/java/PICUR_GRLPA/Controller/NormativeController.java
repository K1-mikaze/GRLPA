package PICUR_GRLPA.Controller;

import PICUR_GRLPA.Model.Normative;
import PICUR_GRLPA.Repository.NormativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class NormativeController {

    @Autowired
    private NormativeRepository Normative_Repository;

    @GetMapping("/normativas")
    public List<Normative> AllNormatives(){
        return Normative_Repository.findAll();
    }

    @GetMapping("/normativa/{id}")
    public Optional<Normative> Find_By_Id(@PathVariable("id") Long id) {
        return Normative_Repository.findById(id);
    }

    @PostMapping("/normativa")
    public Normative Create_Normative(@RequestBody Normative normativa){
        return Normative_Repository.save(normativa);
    }

    @PutMapping("/normativa/{id}")
    public Normative Update_Normative(@PathVariable Long id,@RequestBody Normative normativa){
        return Normative_Repository.save(normativa);
    }

    @DeleteMapping("/normativa/{id}")
    public void  Delete_Normative(@PathVariable("id")Long id){
        Normative_Repository.deleteById(id);
    }

}
