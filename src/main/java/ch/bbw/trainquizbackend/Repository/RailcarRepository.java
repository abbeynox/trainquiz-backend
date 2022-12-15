package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Railcar;
import com.mongodb.client.AggregateIterable;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface RailcarRepository extends MongoRepository<Railcar, Long> {
        @Aggregation(pipeline = {"{$sample: {size: 4}}"}) //zufällig erste 4
        List getRandomRailcars(); //Eventuell auf Array umschreiben
}
