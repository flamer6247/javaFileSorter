import java.util.Scanner;

class main {
    public static void main(String[] args){
        String start;
        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like to start?: ");
        start = scan.next();
        if(start.toLowerCase().equals("yes")){
            FileFunctions.exeFile(args);
            
        }

    }
}