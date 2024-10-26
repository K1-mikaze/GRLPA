package PICUR_GRLPA.Controller;


import PICUR_GRLPA.Model.Education;
import PICUR_GRLPA.Repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class EducationController {

    @Autowired
    private EducationRepository Education_Repository;

    @GetMapping("/educaciones")
    public List<Education> AllEducations(){
        return Education_Repository.findAll();
    }

    @GetMapping("/educaciones/{id}")
    public Optional<Education> Find_By_Id(@PathVariable("id") Long id) {
        return Education_Repository.findById(id);
    }

    @PostMapping("/educacion")
    public Education Create_Education(@RequestBody Education educacion){
        return Education_Repository.save(educacion);
    }

    @PutMapping("/educacion/{id}")
    public Education Update_Education(@PathVariable Long id,@RequestBody Education educacion){
        return Education_Repository.save(educacion);
    }

    @DeleteMapping("/educacion/{id}")
    public void  Delete_Education(@PathVariable("id")Long id){
        Education_Repository.deleteById(id);
    }

}
