package ch.bbw.trainquizbackend.Repository;

import ch.bbw.trainquizbackend.Model.Railcar;
import com.mongodb.client.AggregateIterable;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface RailcarRepository extends MongoRepository<Railcar, Long> {
    public String getRandomRailcars() {
        System.out.println("Search for Random Railcars");
        Arrays.asList(new Document("$sample",
                new Document("size", 4L)));
        return
    }
}
