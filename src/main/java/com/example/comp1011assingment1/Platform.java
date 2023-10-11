package com.example.comp1011assingment1;

public class Platform {
    private int platformId;
    private String title, parentCompany, availibleCountries;
    private int subCount;
    private double price;

    public Platform(int platformId, String title, String parentCompany, String availibleCountries, int subCount, double price) {
        if (platformId >0)
            this.platformId = platformId;
        else
            throw new IllegalArgumentException("The platformId should be greater than 0");
        setTitle(title);
        setParentCompany(parentCompany);
        setAvailibleCountries(availibleCountries);
        setSubCount(subCount);
        setPrice(price);
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getAvailibleCountries() {
        return availibleCountries;
    }

    public void setAvailibleCountries(String availibleCountries) {
        this.availibleCountries = availibleCountries;
    }

    public int getSubCount() {
        return subCount;
    }

    public void setSubCount(int subCount) {
        this.subCount = subCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
