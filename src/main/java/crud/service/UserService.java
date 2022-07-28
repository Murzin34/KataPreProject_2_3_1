package crud.service;

import crud.models.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    @Transactional
    List<User> getUsers();

    @Transactional
    User show(int id);

    @Transactional
    void save(User user);

    @Transactional
    void update(int id, User user);

    @Transactional
    void delete(int id);
}
