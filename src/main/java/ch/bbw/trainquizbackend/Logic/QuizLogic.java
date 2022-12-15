package ch.bbw.trainquizbackend.Logic;

import ch.bbw.trainquizbackend.Model.*;
import ch.bbw.trainquizbackend.Repository.LocomotiveRepository;
import ch.bbw.trainquizbackend.Repository.RailcarRepository;
import ch.bbw.trainquizbackend.Repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
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
        // First fetch all available railcars, after shuffle array and take first 4. Then Random choose a "chosenRailcar", which is the answer
        List<Railcar> allRailcars = railcarRepository.findAll();
        List<Question> railcarsArray = new ArrayList<Question>();

        // Take 4 and Shuffle
        Random rand = new Random();
        for (int i = 0; i < railcarsArray.toArray().length;i++){
            System.out.println(railcarsArray.toArray()[i]);
        }

        questionList.setQuestionCollection(railcarsArray);

        return questionList;

    }



}
