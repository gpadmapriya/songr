package com.example.songr.controllers;

import com.example.songr.models.Album;
import com.example.songr.models.AlbumRepository;
import com.example.songr.models.Song;
import com.example.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m){
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

}
