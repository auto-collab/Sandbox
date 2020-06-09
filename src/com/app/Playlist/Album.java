package com.app.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private ArrayList<Song> songs;
    private static Song song;
    private ArrayList<Album> albums;
    private String albumName;

    public Album(ArrayList<Song> songs, String albumName) {
        this.songs = songs;
        this.albumName = albumName;
    }

    private void createDefaultAlbums() {
        ArrayList<String> songs1 = new ArrayList<String>();
        songs1.add("Make Crack Like this");
        songs1.add("Miss My Homies");
        songs1.add("Make em say UGHH");
        String album1 = createAlbum('Ghetto Dope', songs1);
    }

    private Album createAlbum(String name, ArrayList<String> songs) {
        for(int i=0;i<songs.size();i++) {
            song = new Song(songs.get(i), 3.5);
            this.songs.add(song);
            System.out.println(song);
        }
        return Album;
    }
}
