package ch.bbw.trainquizbackend.Model;

import java.util.List;

public class QuestionList {
    private List<Question> questionCollection;

    public QuestionList(List<Question> questionCollection) {
        this.questionCollection = questionCollection;
    }

    public List<Question> getQuestionCollection() {
        return questionCollection;
    }

    public void setQuestionCollection(List<Question> questionCollection) {
        this.questionCollection = questionCollection;
    }
}
