package com.example.songr.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songcount;
    long length;
    String imageurl;

    public Album(){}
    public Album(String title, String artist, int songCount, long length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songcount = songCount;
        this.length = length;
        this.imageurl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongcount() {
        return songcount;
    }

    public long getLength() {
        return length;
    }

    public String getImageurl() {
        return imageurl;
    }
}
