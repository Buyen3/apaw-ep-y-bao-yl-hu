package es.upm.miw.apaw_ep_themes.dtos;

import es.upm.miw.apaw_ep_themes.documents.Material;

public class MaterialDto {
    private String id;
    private String name;
    private double price;
    private String type;

    public MaterialDto() {
        // empty for framework
    }

    public MaterialDto(Material material) {
        this.name = material.getName();
        this.price = material.getPrice();
        this.type = material.getType();
    }

    public MaterialDto(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}