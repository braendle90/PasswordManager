package com.company;

public class CreateData {

    int ID;
    String title;
    String username;
    String hashcode;
    String website;

    //CONSTRUCTOR
    public CreateData(int ID, String title, String username, String hashcode, String website) {
        this.ID = ID;
        this.title = title;
        this.username = username;
        this.hashcode = hashcode;
        this.website = website;
    }

    //region GETTER & SETTER
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    //endregion
}
