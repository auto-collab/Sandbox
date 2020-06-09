package com.app;

import com.app.Playlist.Album;
import com.app.Playlist.Song;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> firstAlbumSongs = new ArrayList<String>();
        ArrayList<String> secondAlbumSongs = new ArrayList<String>();
        String albumTitle1 = "Ghetto Dope";
        String albumTitle2 = "Thriller";
        Album album1;
        Album album2;

        firstAlbumSongs.add("Make Crack Like this");
        firstAlbumSongs.add("Miss My Homies");
        firstAlbumSongs.add("Make em say UGHH");
        album1 = new Album(albumTitle1, firstAlbumSongs);

        secondAlbumSongs.add("Billie Jean");
        secondAlbumSongs.add("Dirty Diana");
        secondAlbumSongs.add("Rock With You");
        secondAlbumSongs.add("Thriller");
        album2 = new Album(albumTitle2, secondAlbumSongs);

        album1.printSongsOnAlbum();
      //  album2.printSongsOnAlbum();

    }
}
