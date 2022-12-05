package ch.bbw.trainquizbackend.Repository;


import ch.bbw.trainquizbackend.Model.Locomotive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuizRepository extends MongoRepository<Locomotive, String> {

    @Query("{commonName:'?0'}")
    Locomotive findItemByName(String name);

    @Query(value="{constructed:'?0'}", fields="{'id' : 1, 'constructed' : 1991}")
    List<Locomotive> findAll(String category);

    public long count();

}