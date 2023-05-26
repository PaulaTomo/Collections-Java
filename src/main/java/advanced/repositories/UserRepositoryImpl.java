package advanced.repositories;

import advanced.models.User;
import advanced.repositories.interfaces.UserRepository;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

@NoArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private static UserRepository instance = null;

    @Override
    public Collection<User> getModels() {
        return dataList;
    }

    @Override
    public Optional<User> getById(Long id) {

        Stream<User> stream = dataList.stream();
        return dataList.stream().filter(userPredicate(id)).findFirst();

    }

    public Predicate<User> userPredicate(Long id) {
        return (u) -> u.getId().equals(id);

    }

    @Override
    public User save(User user) {
        user.setId(sequence.incrementAndGet());
        dataList.add(user);
        return user;
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl();
        }
        return instance;

    }

}
