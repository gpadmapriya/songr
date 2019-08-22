package com.example.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    int lengthInSeconds;
    int trackNumber;

    @ManyToOne
    Album album;

    public Song(){}
    public Song(String title, int lengthInSeconds, int trackNumber, Album album){
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId() {
        return id;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }
}
