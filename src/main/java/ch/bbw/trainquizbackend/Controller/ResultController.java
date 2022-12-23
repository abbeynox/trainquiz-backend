package ch.bbw.trainquizbackend.Controller;

import ch.bbw.trainquizbackend.Model.Result;
import ch.bbw.trainquizbackend.Repository.ResultRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;

    /**
     * Speichert das Resultat in der Datenbank
     * @param result
     * @return
     */
    @PostMapping("/result")
    public String saveResults(@RequestParam Result result) {
        if(result.getPlayerName().equals("")) {
            throw new IllegalArgumentException("playerName cannot be empty.");
        }
        System.out.println(result.getPlayerName());
        resultRepository.save(result);
        return "Saved";
    }

    /**
     * Gibt alle Resultate aus der Datenbank zurück
     * @return
     */
    @GetMapping("/results")
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    /**
     * Gibt alle Resultate eines Spieles aus der Datenbank zurück
     * @param id
     * @return
     */
    @GetMapping("/result/{id}")
    public String getResultById(@PathVariable String id){
        Result fetchedResult =  resultRepository.findResultById(id);
        return new Gson().toJson(fetchedResult);
    }


}
