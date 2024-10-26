package PICUR_GRLPA.Controller;


import PICUR_GRLPA.Model.Sensor;
import PICUR_GRLPA.Repository.SensoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class SensoresController {

    @Autowired
    private SensoresRepository Sensores_Repository;

    @GetMapping("/sensoress")
    public List<Sensor> AllSensoress(){
        return Sensores_Repository.findAll();
    }

    @GetMapping("/sensores/{id}")
    public Optional<Sensor> Find_By_Id(@PathVariable("id") Long id) {
        return Sensores_Repository.findById(id);
    }

    @PostMapping("/sensores")
    public Sensor Create_Sensores(@RequestBody Sensor sensores){
        return Sensores_Repository.save(sensores);
    }

    @PutMapping("/sensores/{id}")
    public Sensor Update_Sensores(@PathVariable Long id, @RequestBody Sensor sensores){
        return Sensores_Repository.save(sensores);
    }

    @DeleteMapping("/sensores/{id}")
    public void  Delete_Sensores(@PathVariable("id")Long id){
        Sensores_Repository.deleteById(id);
    }


}
