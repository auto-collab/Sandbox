package com.app;

import com.app.Playlist.Album;
import com.app.Playlist.Song;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> songsForGhettoDope = new ArrayList<String>();
        songsForGhettoDope.add("Make Crack Like this");
        songsForGhettoDope.add("Miss My Homies");
        songsForGhettoDope.add("Make em say UGHH");


        Song song = new Song(songsForGhettoDope.get(0), 5.5);
        Song song2 = new Song(songsForGhettoDope.get(2), 5.5);
        System.out.println(song.getTitle());
        System.out.println(song2.getTitle());
    }
}
