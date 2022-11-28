import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        Parallelepiped parallelepiped = new Parallelepiped(height,length,width);

        try{
            if (height > 20 && length > 20 && width > 20){
                throw new RuntimeException("20dan chon san bolboyt");
            }if ( height < 0 && length < 0 && width < 0 ){
                throw new RuntimeException("minus san jazulbait");
            }

        }catch (InputMismatchException e){
            System.err.println("tamga jazylbayt ");
        }catch (RuntimeException e){
            System.err.println(e);
        }
        parallelepiped.method1();
        parallelepiped.method();



    }
}