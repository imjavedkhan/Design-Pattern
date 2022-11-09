package Adapter.example2;

public class DriverClass {
    public static void main(String[] args) {

        GalleryApp gallery = new GalleryApp();
        gallery.Show("png","abc.jpeg");
        gallery.Show("jpeg","zzz.jpeg");
        gallery.Show("jpg","zxy.jpeg");
    }
}
