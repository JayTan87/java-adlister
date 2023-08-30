package daos;

public class DaoFactory {
    private static Albums albumsDao;

    public static Albums getAlbumsDao() {
        if(albumsDao == null) {
            albumsDao = new MySQLAlbumsDao();
        }
        return albumsDao;
    }

//    public static ProductsDao getProductsDao() {
//        if (productsDao == null) {
//            productsDao = new ListProducts();
//        }
//        return productsDao;
//    }
}
