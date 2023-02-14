package data.repository;

import data.models.User;

import java.util.List;

public interface UserRepository {

    User save(User user);

    Long countUser();

    List<User> findAll();

    User findById(int id);

    void deleteById();

    void deleteAll();

}
