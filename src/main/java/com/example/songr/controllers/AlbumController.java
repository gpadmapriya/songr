package com.example.songr.controllers;

import com.example.songr.models.Album;
import com.example.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        //Album album = new Album("title", "artist", 3, 200, "image url");
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";

    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, long length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

}