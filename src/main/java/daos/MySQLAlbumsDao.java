package daos;

import models.Album;

import java.util.ArrayList;
import java.util.List;

public class MySQLAlbumsDao implements Albums{

    private List<Album> albums = new ArrayList<>();

    public MySQLAlbumsDao(){
    }
    @Override
    public List<Album> all() {
        return null;
    }

    @Override
    public Album findAlbumById(long id) {
        return null;
    }

    @Override
    public void insert(Album album) {
        albums.add(album);

    }

    @Override
    public void update(Album album) {

    }

    @Override
    public void delete(Album album) {

    }
}
