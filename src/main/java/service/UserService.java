
package service;

import model.AppUser;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<AppUser> users = new ArrayList<>();

    public UserService() {
        users.add(new AppUser(1L, "admin", "admin123", "ADMIN"));
        users.add(new AppUser(2L, "user", "user123", "USER"));
    }

    public List<AppUser> getAllUsers() {
        return users;
    }

    public AppUser getUserById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public AppUser getUserByUsername(String username) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}