package pl.javastart.library.app;

public class LibraryApp {
    final static private String APP_NAME= "Biblioteka";
    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }


}
