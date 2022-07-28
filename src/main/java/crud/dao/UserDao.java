package crud.dao;

import crud.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    User show (int id);

    void save(User user);

    void update(User user);

    void delete (int id);
}