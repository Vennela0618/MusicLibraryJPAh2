package com.example.song.repository;
import com.example.song.model.Song;

import java.util.ArrayList;

public interface SongRepository {

  void deleteSong(int songId);

  Song updateSong(int songId, Song song);

  Song addSong(Song song);

  Song getSongById(int songId);

  ArrayList<Song> getSongs();
}
