package com.example.td3;

import java.util.List;

//I am going to maintain the product but replace them by MOST POPULAR TV's'

public class product  {


    private String id;

    private String rank;

    private String rankUpDown;


    private String title;


    private String fullTitle;


    private String year;

    private String image;

    private String crew;

    private String imDbRating;

    private String imDbRatingCount;



    public String getId() {
        return id;
    }

    public product(String id, String rank, String rankUpDown, String title, String fullTitle, String year, String image, String crew, String imDbRating, String imDbRatingCount) {
        this.id = id;
        this.rank = rank;
        this.rankUpDown = rankUpDown;
        this.title = title;
        this.fullTitle = fullTitle;
        this.year = year;
        this.image = image;
        this.crew = crew;
        this.imDbRating = imDbRating;
        this.imDbRatingCount = imDbRatingCount;
    }

    public String getRank() {
        return rank;
    }

    public String getRankUpDown() {
        return rankUpDown;
    }

    public String getTitle() {
        return title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public String getYear() {
        return year;
    }

    public String getImage() {
        return image;
    }

    public String getCrew() {
        return crew;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public String getImDbRatingCount() {
        return imDbRatingCount;
    }
}
