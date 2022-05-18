package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("John", "Goodman", (byte) 30);
        userService.saveUser("Jack", "Johnson", (byte) 25);
        userService.saveUser("Sara", "Miles", (byte) 47);
        userService.saveUser("Jennifer", "Anniston", (byte) 53);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
