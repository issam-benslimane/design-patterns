public abstract class ImageCompression {
    public final int[] compress(int[] data) {
        int[] preprocessed = preprocess(data);
        int[] compressed = doCompress(preprocessed);
        return postprocess(compressed);
    }

    protected abstract int[] preprocess(int[] data);
    protected abstract int[] doCompress(int[] data);
    protected abstract int[] postprocess(int[] data);
} 