package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Railcar;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RailcarRepository extends MongoRepository<Railcar, Long> {
}
