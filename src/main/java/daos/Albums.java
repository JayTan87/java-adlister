package daos;

import models.Album;

import java.util.List;

public interface Albums {
    List<Album> all();
    Album findAlbumById(long id);
    void insert(Album album);
    void update(Album album);
    void delete(Album album);
}
