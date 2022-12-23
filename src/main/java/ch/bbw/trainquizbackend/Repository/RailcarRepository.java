package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Railcar;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RailcarRepository extends MongoRepository<Railcar, Long> {
        /**
         * Returns a random railcar from the database
         * @return a random railcar
         */
        @Aggregation(pipeline = {"{$sample: {size: 4}}"})
        List getRandomRailcars(); //Eventuell auf Array umschreiben
}
