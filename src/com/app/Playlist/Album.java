package com.app.Playlist;

import java.util.ArrayList;

public class Album  {

    private ArrayList<Song> songs = new ArrayList<Song>();;
    private ArrayList<Album> albums = new ArrayList<Album>();
    private String name = null;

    public Album(String name, ArrayList<String> songs) {
        this.name = name;
        this.songs = convertToSongs(songs);
    }

    public ArrayList<Song> getSongsOnAlbum() {
        return this.songs;
    }

    public void printSongsOnAlbum() {
        for(Song s : getSongsOnAlbum()) {
            System.out.println(s.getTitle());
        }
    }

    public ArrayList<Album> getAllAlbums() {
        return this.albums;
    }

    public Album getAlbum(String albumName) {
        if (getAllAlbums().size() <= 0) {
            System.out.println("\n(!) No albums are in the collection (!)\n");
            return null;
        }
        for (Album a : getAllAlbums()) {
            if (a.getName().compareTo(albumName) == 0) {
                return a;
            }
            System.out.println("\n(!) Album is not in collection (!)\n");
            return null;
        }
        return null;
    }


    public String getName() {
        return this.name;
    }

    public boolean addAlbumToAlbumsList(Album album) {
        this.albums.add(album);
        return true;
    }

    public void printAlbumList() {
        for(Album a : getAllAlbums()) {
            System.out.println(getName());
        }
    }

    public Album createAlbum(String name, ArrayList<String> songs) {
        return new Album(name, songs);
    }

    private ArrayList<Song> convertToSongs(ArrayList<String> stringSongs) {
        ArrayList<Song> newSongs = new ArrayList<Song>();
        for(String s : stringSongs) {
            newSongs.add(new Song(s));
        }
        return newSongs;
    }
}
