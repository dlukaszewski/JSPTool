package service;

import model.User;
import model.UserDao;
import model.UserDaoImpl;


public interface UserService {
    boolean checkIfValid (String login, String password);
}
