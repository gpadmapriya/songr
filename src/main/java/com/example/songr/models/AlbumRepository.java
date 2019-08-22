package com.example.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long>{
    public Album findById(int id);

}
