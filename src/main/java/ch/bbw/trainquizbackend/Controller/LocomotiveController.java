package ch.bbw.trainquizbackend.Controller;

import ch.bbw.trainquizbackend.Model.Locomotive;
import ch.bbw.trainquizbackend.Repository.LocomotiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LocomotiveController {
    @Autowired
    private LocomotiveRepository locomotiveRepository;

    @GetMapping("/locomotives")
    public List<Locomotive> getAllLocomotives() {
        return locomotiveRepository.findAll();
    }
}
