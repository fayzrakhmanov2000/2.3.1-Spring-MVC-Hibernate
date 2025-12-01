package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    private final List<User> users = Arrays.asList(
//            new User(1, "Mark", "Walberg"),
//            new User(2, "Robert", "Kiosaki"),
//            new User(3, "Alex", "Bolduin"),
//            new User(4, "Genry", "Ford"),
//            new User(5, "Mike", "Hudson")
//    );

//    @Override
//    public List<User> getUsers(Integer count) {
//        if (count == null || count >= users.size()) {
//            return users;
//        }
//        return users.subList(0, count);
//    }

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
