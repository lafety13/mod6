package task5;

import task4.User;
import java.util.Arrays;
import java.util.Objects;

public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        return Arrays.stream(users)
                .distinct()
                .toArray(User[]::new);
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        return Arrays.stream(users)
                .filter(user -> user.getBalance() == balance)
                .toArray(User[]::new);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        return Arrays.stream(users)
                .peek(user -> user.setBalance(user.getSalary()))
                .toArray(User[]::new);
    }

    public static final long[] getUsersId(User[] users) {
        return Arrays.stream(users)
                .filter(Objects::nonNull)
                .mapToLong(User::getId)
                .toArray();
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int len = users.length;
        for (int i = 0; i < len; i++) {
            if (users[i] != null && isEmptyUser(users[i])) {
                arrayShift(users, i);
                i--;
            }
        }
        return users;
    }
    private static boolean isEmptyUser(User user) {
        return user.getFirstName().isEmpty() &&
                user.getLastName().isEmpty();
    }

    private static void arrayShift(User[] user, int index) {
        int len = user.length;
        for (int k = index; k < len; k++) {
            if (k == len - 1) {
                user[k] = null;
                break;
            }
            user[k] = user[k+1];
        }
    }



}
