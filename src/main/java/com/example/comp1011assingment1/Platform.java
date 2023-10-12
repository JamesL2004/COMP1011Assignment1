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
    //Checks to see if the string variable is under 50 characters.
    public void setTitle(String title) {
        if(title.length() <= 50){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Title must be 50 characters or under.");
        }
    }

    public String getParentCompany() {
        return parentCompany;
    }
    //Checks to see if the string variable is under 50 characters.
    public void setParentCompany(String parentCompany) {
        if(title.length() <= 50){
            this.parentCompany = parentCompany;
        }
        else{
            throw new IllegalArgumentException("Parent Company must be 50 characters or under.");
        }
    }

    public String getAvailibleCountries() {
        return availibleCountries;
    }
    //Checks to see if the string variable is under 100 characters.
    public void setAvailibleCountries(String availibleCountries) {
        if(title.length() <= 100){
            this.availibleCountries = availibleCountries;
        }
        else{
            throw new IllegalArgumentException("Available Countries must be 100 characters or under.");
        }
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
