package ch.bbw.trainquizbackend.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("results")
public class Result {

    @Id
    private String id;

    private String playerName;
    private int points;
    private int playingTime; // in seconds

    public Result(String id, String playerName, int points, int playingTime) {
        this.id = id;
        this.playerName = playerName;
        this.points = points;
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
                ", playingTime=" + playingTime +
                '}';
    }
}
