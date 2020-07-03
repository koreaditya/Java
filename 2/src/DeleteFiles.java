import java.io.File;

public class DeleteFiles {
 public static void main(String[] args) {
  File[] pathnames;
  File folder = new File("C:\\Users\\Aditya Kore\\Documents\\Java\\2");
  pathnames = folder.listFiles();
  String firstChar;
  
  for (File pathname : pathnames) {
   if (pathname.isFile()) {
    firstChar = pathname.getName().substring(0, 1);
    if (firstChar.equals("s") || firstChar.equals("S")) {
     System.out.println(pathname.delete());
    }
   }
   }
}
}

