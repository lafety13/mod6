package task6;

import task3.ArraysUtils;
import task4.User;
import task5.UserUtils;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User[] userArray = new User[4];
        User user1 = new User(1, "Vadim", "kozak", 12200, 3000);
        User user2 = new User(2, "ivan", "petrov", 10000, 5000);
        User user3 = new User(2, "ivan", "petrov", 10000, 5000);
        User user4 = new User(3, "", "", 15000, 6000);

        userArray[0] = user1;
        userArray[1] = user2;
        userArray[2] = user3;
        userArray[3] = user4;

        //getUsersId
        System.out.println(" getUsersId");
        Arrays.stream(UserUtils.getUsersId(userArray))
                .forEach(System.out::println);

        //usersWithContitionalBalance
        System.out.println(" usersWithContitionalBalance");
        Arrays.stream(UserUtils.usersWithContitionalBalance(userArray, 5000))
                .forEach(user -> System.out.println(user.toString()));

        //uniqueUsers
        System.out.println(" uniqueUsers");
        Arrays.stream(UserUtils.uniqueUsers(userArray))
                .forEach(user -> System.out.println(user.toString()));

        //paySalaryToUsers
        System.out.println(" paySalaryToUsers");
        Arrays.stream(UserUtils.paySalaryToUsers(userArray))
                .forEach(user -> System.out.println(user.toString()));

        //deleteEmptyUsers
        System.out.println(" deleteEmptyUsers");
        Arrays.stream(UserUtils.deleteEmptyUsers(userArray))
                .filter(Objects::nonNull)
                .forEach(user -> System.out.println(user.toString()));
        System.out.println();
    }
}
