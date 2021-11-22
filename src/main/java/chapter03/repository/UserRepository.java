package chapter03.repository;

import chapter03.domain.User;

public interface UserRepository {

    void save(User user);
    User findById(Long id);
    User findByUsername(String username);

}
