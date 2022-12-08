package ch.bbw.trainquizbackend.Controller;

import ch.bbw.trainquizbackend.Model.Result;
import ch.bbw.trainquizbackend.Repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;

    @GetMapping("/results")
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }
}
