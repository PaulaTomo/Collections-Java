package advanced.services;

import advanced.exceptions.BusinessException;
import advanced.exceptions.enums.ErrorType;
import advanced.exceptions.ValidationException;
import advanced.models.User;
import advanced.repositories.UserRepositoryImpl;
import advanced.repositories.interfaces.UserRepository;
import advanced.services.interfaces.UserService;
import lombok.AllArgsConstructor;

import java.util.Collection;

import static advanced.exceptions.enums.InvalidType.PASSWORD_INVALID_LENGTH;
import static advanced.exceptions.enums.InvalidType.PASSWORD_MANDATORY;

@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private static UserService instance = null;
    private final UserRepository userRepository;


    @Override
    public Collection<User> getAll() {
        return this.userRepository.getModels();
    }

    @Override
    public User findById(long id) {
        System.out.printf("Find user by id %s%n", id);
        return this.userRepository.getById(id)
                .orElseThrow(() -> new BusinessException("User  not found!", ErrorType.USER_NOT_FOUND));

    }

    @Override
    public User save(User user) {
        if (user.getPassword() == null) {
            throw new ValidationException(PASSWORD_MANDATORY);
        }
        if (user.getPassword().length() < 6) {
            throw new ValidationException(PASSWORD_INVALID_LENGTH);
        }
        final User saved = this.userRepository.save(user);
        System.out.printf("Successfully save new user %s%n", user);
        return saved;
    }

    public static UserService getInstance() {
        if (instance == null) {
            final UserRepository userRepoInstance = UserRepositoryImpl.getInstance();
            instance = new UserServiceImpl(userRepoInstance);

        }
        return instance;
    }
}
