import exercice2.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ImageFramework framework = new ImageFramework();

        System.out.println("Enter filter class name:");
        String filterClass = scanner.nextLine();
        ImageFilter filter = (ImageFilter) Class.forName(filterClass).newInstance();
        framework.setFilter(filter);

        System.out.println("Enter compression class name:");
        String compressionClass = scanner.nextLine();
        ImageCompression compression = (ImageCompression) Class.forName(compressionClass).newInstance();
        framework.setCompression(compression);

        int[] data = {1, 2, 3, 4, 5};
        int[] filtered = framework.filter(data);
        int[] compressed = framework.compress(filtered);
    }
} 