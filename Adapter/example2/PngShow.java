package Adapter.example2;

public class PngShow implements AdvanceImageViewer{
    @Override
    public void showPng(String fileName) {
        System.out.println("Showing PNG file : " + fileName);
    }

    @Override
    public void showJpg(String fileName) {
    }
}
