import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class DownDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес сайта:");
        String stringURL = scanner.nextLine();
        try {
            System.out.println(InetAddress.getByName(stringURL));
            System.out.println(InetAddress.getByName(stringURL).isReachable(5000));
            if (InetAddress.getByName(stringURL).isReachable(5000)) {
                System.out.println("Сайт доступен!");
            } else {
                System.out.println("Сайт недоступен!");
            }
        } catch (UnknownHostException e) {
            System.out.println("Сайт не найден!");
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
