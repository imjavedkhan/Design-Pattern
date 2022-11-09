package Adapter.example2;

public class GalleryApp implements ImageViewer{

    AdvanceImageAdapter advanceImageAdapter;
    @Override
    public void Show(String imageFormat, String fileName) {

        if(imageFormat.equalsIgnoreCase("jpeg")){
            System.out.println("Show JPEG file name : " + fileName);
        }
        else if (imageFormat.equalsIgnoreCase("png")
                || imageFormat.equalsIgnoreCase("jpg")) {
            advanceImageAdapter = new AdvanceImageAdapter(imageFormat);
            advanceImageAdapter.Show(imageFormat,fileName);
        }
        else{
            System.out.println("Invalid image format : " + imageFormat);
        }
    }
}
