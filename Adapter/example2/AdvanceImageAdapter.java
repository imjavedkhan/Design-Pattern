package Adapter.example2;

public class AdvanceImageAdapter implements ImageViewer{

    AdvanceImageViewer advanceImageViewer; // Adaptee interface/class

    //adaptee class object creation based on input
    public AdvanceImageAdapter(String imageFormat) {
       if(imageFormat.equalsIgnoreCase("png")){
           advanceImageViewer = new PngShow();
       } else if (imageFormat.equalsIgnoreCase("jpg")) {
           advanceImageViewer = new JpgShow();
       }
    }

    @Override
    public void Show(String imageFormat, String fileName) {
        if(imageFormat.equalsIgnoreCase("png")){
            advanceImageViewer.showPng(fileName);
        }
        else if(imageFormat.equalsIgnoreCase("jpg")){
            advanceImageViewer.showJpg(fileName);
        }
    }
}
