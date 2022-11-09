package Adapter.example2;

public class JpgShow implements AdvanceImageViewer{
    @Override
    public void showPng(String fileName) {
    }

    @Override
    public void showJpg(String fileName) {
        System.out.println("Showing JPG file : " + fileName);
    }
}
