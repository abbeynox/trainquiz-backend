package ch.bbw.trainquizbackend.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("results")
public class Result {

    @Id
    private String id;

    private String playerName;
    private int points = 0; // count of correct responses (5 responses possible)
    private Date startTime;
    private Date finishedTime;
    private int playingTime; // in seconds -> finishedTime - startTime

    public Result() {
        super();
    }

    public Result(String id, String playerName, int points, Date startTime, Date finishedTime, int playingTime) {
        this.id = id;
        this.playerName = playerName;
        this.points = points;
        this.startTime = startTime;
        this.finishedTime = finishedTime;
        this.playingTime = playingTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id='" + id + '\'' +
                ", playerName='" + playerName + '\'' +
                ", points=" + points +
                ", startTime=" + startTime +
                ", finishedTime=" + finishedTime +
                ", playingTime=" + playingTime +
                '}';
    }
}
