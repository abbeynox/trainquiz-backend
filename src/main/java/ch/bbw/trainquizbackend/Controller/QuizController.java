package ch.bbw.trainquizbackend.Controller;

import ch.bbw.trainquizbackend.Logic.QuizLogic;
import ch.bbw.trainquizbackend.Model.QuestionList;
import ch.bbw.trainquizbackend.Model.Result;
import ch.bbw.trainquizbackend.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class QuizController {
    Result result;

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    QuizLogic quizLogic;

    @PostMapping("/questions") // hier ggf quiz art property einbauen
    // Um das Quiz zu starten, müssen wir den Spielernamen und die Startzeit mitschicken
    public String quiz(@RequestParam String playerName) {
        if(playerName.equals("")) {
            throw new IllegalArgumentException("playerName cannot be empty.");
        }
        System.out.println(playerName);
        //result.setPlayerName(playerName);

        QuestionList questionList = quizLogic.getRailcarQuestions();
        String ques = questionList.toString();
        System.out.println(questionList);
        return ques;
    }
}
