public class ImageFramework {
    private ImageFilter filter;
    private ImageCompression compression;

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void setCompression(ImageCompression compression) {
        this.compression = compression;
    }

    public int[] filter(int[] data) {
        return filter.filter(data);
    }

    public int[] compress(int[] data) {
        return compression.compress(data);
    }
} 