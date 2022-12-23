package ch.bbw.trainquizbackend.Controller;

import ch.bbw.trainquizbackend.Logic.QuizLogic;
import ch.bbw.trainquizbackend.Model.QuestionList;
import ch.bbw.trainquizbackend.Model.Result;
import ch.bbw.trainquizbackend.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QuizController {
    Result result;

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    QuizLogic quizLogic;

    // Erstellt einen Eintrag für das ganze Quiz
    @GetMapping("/questions") // hier ggf quiz art property einbauen
    // Um das Quiz zu starten, müssen wir den Spielernamen und die Startzeit mitschicken
    public String getQuestions() {

        QuestionList questionList = quizLogic.getRailcarQuestions();
        String ques = questionList.toString();
        System.out.println(questionList);
        return ques;
    }
}
