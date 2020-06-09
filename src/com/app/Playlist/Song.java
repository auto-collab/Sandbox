package com.app.Playlist;

import java.awt.*;
import java.util.ArrayList;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song(String title) {
        this.title = title;
        this.duration = 3.5;
    }

    public String getTitle() {
        return title;
    }

//    public boolean addSongToAlbum(String albumName, String songName) {
//        Album album = new Album();
//        ArrayList<Album> albums = album.getAlbums();
//        for(Album a : albums) {
//            System.out.println(a.getAlbumName());
//            if(a.getAlbumName().compareTo(albumName) == 0) {
//                album = a;
//                return true;
//            }
//        }
//        return false;
 //   }

}
