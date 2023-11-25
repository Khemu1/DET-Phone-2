package DET;

public class CameraPhone extends Phone {
    private int imageSize;  // in megapixels
    private int memorySize; // in gigabytes

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures() {
        return memorySize * 1000 / imageSize;
    }
}
