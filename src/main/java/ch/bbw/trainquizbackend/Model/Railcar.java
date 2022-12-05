package ch.bbw.trainquizbackend.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document("railcars")
public class Railcar {

    @Id
    private String id;

    private String commonName;
    private String model;
    private String category;
    private boolean lowfloorentry;
    private int constructed;
    private String manufacturer;
    private boolean inService;
    private int capacity;
    private int maxSpeed;
    private String imageSource;

    public Railcar(String id, String commonName, String model, String category, boolean lowfloorentry, int constructed, String manufacturer, boolean inService, int capacity, int maxSpeed, String imageSource) {
        this.id = id;
        this.commonName = commonName;
        this.model = model;
        this.category = category;
        this.lowfloorentry = lowfloorentry;
        this.constructed = constructed;
        this.manufacturer = manufacturer;
        this.inService = inService;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.imageSource = imageSource;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isLowfloorentry() {
        return lowfloorentry;
    }

    public void setLowfloorentry(boolean lowfloorentry) {
        this.lowfloorentry = lowfloorentry;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }
}

