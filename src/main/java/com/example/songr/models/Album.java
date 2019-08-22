package com.example.songr.models;
import javax.persistence.*;
import java.util.List;

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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "album")
    List<Song> songs;

    public Album(){}

    public Album(String title, String artist, int songCount, long length){
        this.title = title;
        this.artist = artist;
        this.songcount = songCount;
        this.length = length;
    }

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

    public List<Song> getSongs() {
        return songs;
    }

    public String toString() {
        return this.title + " by " + this.artist;
        //return String.format("%s %s", this.title, this.artist);
    }
}
