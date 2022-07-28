package crud.service;

import crud.dao.UserDao;
import crud.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private UserDao userDaoImpl;

    public UserServiceImpl(UserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return userDaoImpl.getUsers();
    }

    @Override
    @Transactional
    public User show(int id) {
        return userDaoImpl.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDaoImpl.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User user) {
        userDaoImpl.update(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDaoImpl.delete(id);
    }
}