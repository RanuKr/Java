import java.io.*;

public class FileSearch {
    public static void main(String[] args) throws Exception {
        try {
           String path = "Test";
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Invalid path: " + path);
                System.exit(0);
            }
            for (File item : file.listFiles()) {
                String name = item.getName();
                if (name.contains(".txt")) {
                    System.out.println(item.getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
