package ch.bbw.trainquizbackend.Logic;

import ch.bbw.trainquizbackend.Model.Question;
import ch.bbw.trainquizbackend.Model.QuestionList;
import ch.bbw.trainquizbackend.Model.Railcar;
import ch.bbw.trainquizbackend.Model.Result;
import ch.bbw.trainquizbackend.Repository.RailcarRepository;
import ch.bbw.trainquizbackend.Repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuizLogic {
    // Questions
    @Autowired
    Question question;
    @Autowired
    QuestionList questionList;

    @Autowired
    Railcar railcar;
    @Autowired
    RailcarRepository railcarRepository;

    @Autowired
    Result result;
    @Autowired
    ResultRepository resultRepository;

    public QuestionList getRailcarQuestions() {
        // TODO: Question Generation
        // First fetch all available railcars, after shuffle array and take first 4. Then Random choose a "chosenRailcar", which is the answer
        List<Railcar> allRailcars = railcarRepository.findAll();
        List<Question> railcarsArray = new ArrayList<Question>();

        // Take 4 and Shuffle
        Random rand = new Random();
        /*
        for (int i = 0; i < railcarsArray.toArray().length;i++){
            System.out.println(railcarsArray.toArray()[i]);
        }
        */

        for (int i = 0; i < 4; i++) {
            int randomIndexToSwap = rand.nextInt(allRailcars.size());
            Railcar temp = allRailcars.get(randomIndexToSwap);
            allRailcars.set(randomIndexToSwap, allRailcars.get(i));
            allRailcars.set(i, temp);
        }
        questionList.setQuestionCollection(railcarsArray);

        // Fragenstruktur einzelnes Modell

        // 1. Frage: Welcher Modellname ist auf dem Bild zu sehen?

        // 2. Frage: Welches Baujahr hat dieser Triebwagen?



        return questionList;

    }



}
