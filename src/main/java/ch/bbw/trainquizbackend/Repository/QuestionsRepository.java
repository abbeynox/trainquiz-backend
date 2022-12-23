package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Locomotive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface QuestionsRepository extends MongoRepository<Locomotive, String> {
}
