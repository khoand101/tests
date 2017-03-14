import java.io.File;

/**
 * Created by KhoaND101 on 3/15/2017.
 */
public class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("c:\\a1.txt");
            if (file.delete()) {
                System.out.println("The file: " + file.getName() + " is deleted! "+ file.getPath());
            } else{
                System.out.println("The file is not deleted"+file.getAbsolutePath());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
