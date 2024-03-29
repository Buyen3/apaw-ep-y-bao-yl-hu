package es.upm.miw.apaw_ep_themes.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class House {
    @Id
    private String id;
    private double price;
    private LocalDateTime dealDate;
    private double area;
    private Boolean isNew;

    public House() {
    }
    public House(double price, LocalDateTime dealDate, double area, Boolean isNew) {
        this.price = price;
        this.dealDate = dealDate;
        this.area = area;
        this.isNew = isNew;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDealDate() {
        return dealDate;
    }

    public double getArea() {
        return area;
    }

    public Boolean getISNew() {
        return isNew;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "House{" +

                ", price=" + price +
                ", dealDate='" + dealDate + '\'' +
                ", area='" + area + '\'' +
                ", isNew='" + isNew + '\'' +
                '}';
    }
}
