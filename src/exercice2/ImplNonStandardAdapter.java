public class ImplNonStandardAdapter implements ImageFilter {
    private ImplNonStandard implNonStandard;
    private String filterName;

    public ImplNonStandardAdapter(ImplNonStandard implNonStandard, String filterName) {
        this.implNonStandard = implNonStandard;
        this.filterName = filterName;
    }

    public int[] filter(int[] data) {
        return implNonStandard.appliquerFiltre(filterName, data);
    }
} 