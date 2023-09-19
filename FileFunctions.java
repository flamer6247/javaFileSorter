import java.io.File;

public class FileFunctions {
    
    public static void exeFile(String args[]){
        String path = "C:\\Users\\Aaron\\Downloads\\EXE Files";
        File directory= new File("C:\\Users\\Aaron\\Downloads");
        int folderSize = directory.list().length;
        String[] files = directory.list();
        File f1 = new File(path);
        String fileName;
        int startLength;
        int nameLength;

        boolean bool = f1.mkdir();
        for(int x = 0; x < folderSize; x++)
        {
            nameLength = files[x].length();
            startLength = nameLength - 3;
            fileName = files[x];

            if(fileName.substring(startLength , nameLength) != null){
                
            }
        }

        if(bool){
            System.out.println("done");
        }else{
            System.out.println("fail");
        }
    }

}
