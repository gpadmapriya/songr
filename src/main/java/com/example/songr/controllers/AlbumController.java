package com.example.songr.controllers;

import com.example.songr.models.Album;
import com.example.songr.models.AlbumRepository;
import com.example.songr.models.Song;
import com.example.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";

    }

    @GetMapping("/albums/{id}")
    public String getSingleAlbum(@PathVariable long id, Model m){
        Album currentAlbum = albumRepository.findById(id).get();
        m.addAttribute("album", currentAlbum);
        return "singleAlbum";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songcount, long length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songcount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
    @PostMapping("/albums/{album.id}")
    public RedirectView addSong(String title, int lengthInSeconds, int trackNumber, long id){
        Album album = albumRepository.findById(id).get();
        Song newSong = new Song(title, lengthInSeconds, trackNumber, album);
        songRepository.save(newSong);
        return new RedirectView("/albums/{album.id}/songs");
    }

    @GetMapping("/songs")
    public String getAllSongs(Model m){
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

}
