package ch.bbw.trainquizbackend;

import ch.bbw.trainquizbackend.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TrainquizBackendApplication {

	@Autowired
	QuizRepository locomotiveRepo;

	public static void main(String[] args) {
		SpringApplication.run(TrainquizBackendApplication.class, args);
	}

}
