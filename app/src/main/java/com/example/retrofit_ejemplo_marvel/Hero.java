package com.example.retrofit_ejemplo_marvel;

public class Hero {

    private String name_string;
    private String realname_string;
    private String team_string;
    private String firstappearance_string;
    private String createdby_string;
    private String publisher_string;
    private String imageurl_string;
    private String bio_string;

    public Hero(String name_string, String realname_string, String team_string, String firstappearance_string, String createdby_string, String publisher_string, String imageurl_string, String bio_string) {
        this.name_string = name_string;
        this.realname_string = realname_string;
        this.team_string = team_string;
        this.firstappearance_string = firstappearance_string;
        this.createdby_string = createdby_string;
        this.publisher_string = publisher_string;
        this.imageurl_string = imageurl_string;
        this.bio_string = bio_string;
    }

    public String getName_string() {
        return name_string;
    }

    public String getRealname_string() {
        return realname_string;
    }

    public String getTeam_string() {
        return team_string;
    }

    public String getFirstappearance_string() {
        return firstappearance_string;
    }

    public String getCreatedby_string() {
        return createdby_string;
    }

    public String getPublisher_string() {
        return publisher_string;
    }

    public String getImageurl_string() {
        return imageurl_string;
    }

    public String getBio_string() {
        return bio_string;
    }
}
