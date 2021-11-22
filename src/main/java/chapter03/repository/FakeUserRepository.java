package chapter03.repository;

import chapter03.domain.User;

import java.util.ArrayList;
import java.util.Collection;

public class FakeUserRepository implements UserRepository {

    private Collection<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        if (findById(user.getId()) == null) {
            users.add(user);
        }
    }

    @Override
    public User findById(Long id) {
        return users
                .stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public User findByUsername(String username) {
        return users
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
