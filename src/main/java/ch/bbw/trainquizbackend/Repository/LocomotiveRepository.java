package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Locomotive;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocomotiveRepository extends MongoRepository<Locomotive, Long> {
}
