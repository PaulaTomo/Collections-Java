package advanced.services.interfaces;

import advanced.models.User;

import java.util.Collection;

public interface UserService {


    Collection<User> getAll();

    User findById(long id);

    User save(User user);
}
