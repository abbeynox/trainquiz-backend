package ch.bbw.trainquizbackend.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("locomotives")
public class Locomotive {

    @Id
    private String id;

    private String commonName;
    private String alternativeName;
    private int constructed;
    private String manufacturer;
    private boolean inService;
    private int maxSpeed;
    private int weight;
    private String imageSource;
    private String comments;

    public Locomotive(String id, String commonName, String alternativeName, int constructed, String manufacturer, boolean inService, int maxSpeed, int weight, String imageSource, String comments) {
        this.id = id;
        this.commonName = commonName;
        this.alternativeName = alternativeName;
        this.constructed = constructed;
        this.manufacturer = manufacturer;
        this.inService = inService;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.imageSource = imageSource;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public int getConstructed() {
        return constructed;
    }

    public void setConstructed(int constructed) {
        this.constructed = constructed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isInService() {
        return inService;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


}
