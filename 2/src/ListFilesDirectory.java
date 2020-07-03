import java.io.File;

public class ListFilesDirectory {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Aditya Kore\\Documents\\Java\\2");
        String[] elements = dir.list();
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
