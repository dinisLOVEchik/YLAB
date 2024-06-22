import service.*;
import service.impl.BookingServiceImpl;
import service.impl.ResourceServiceImpl;
import service.impl.UserServiceImpl;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UserServiceImpl userService = new UserServiceImpl();
        while (true){
            System.out.println("Введите команду:");
            String command = scanner.nextLine();
            switch (command){
                case "Создать пользователя":
                    System.out.println("Введите логин:");
                    String login = scanner.next();
                    System.out.println("Введите пароль:");
                    String password = scanner.next();
                    System.out.println(userService.createUser(login, password));
                    break;
                case "Список пользователей":
                    System.out.println("Список пользователей: ");
                    userService.getUsers().forEach(user -> System.out.println(user.getLogin()));
                    break;
                case "Удалить пользователя":
                    System.out.println("Введите имя пользователя, которого желаете удалить:");
                    System.out.println(userService.deleteUser(scanner.next()));
                    break;
                case "Получить пользователя":
                    System.out.println("Введите имя пользователя:");
                    userService.getUser(scanner.next());
            }



//            Workspace workspace = new Workspace(1L, "Workspace 1", 10);
//            MeetingRoom room = new MeetingRoom(1L, "Room 1", 20);
//
//            Booking booking = new Booking(1L, userService.getUser(scanner.next()), workspace, LocalDateTime.of(2024, 6, 21, 10, 0),
//                    LocalDateTime.of(2024, 6, 22, 12, 0));
//
//            ResourceServiceImpl resourceService = new ResourceServiceImpl();
//            resourceService.addResource(workspace);
//            resourceService.addResource(room);
//
//            BookingServiceImpl bookingService = new BookingServiceImpl();
//            bookingService.addBooking(booking);
//
//            System.out.println("Бронирование создано");
        }
    }
}
