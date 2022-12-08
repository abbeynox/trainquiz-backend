package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends MongoRepository<Result, Long> {
}
