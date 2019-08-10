package service;

import model.User;
import model.UserDao;
import model.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public boolean checkIfValid (String login, String password) {
        User user = userDao.getUser(login);

        return user != null
                && user.getLogin().equals(login)
                && user.getPassword().equals(password);
    }
}