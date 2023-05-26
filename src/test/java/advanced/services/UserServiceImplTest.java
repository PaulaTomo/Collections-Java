package advanced.services;

import advanced.models.User;
import advanced.repositories.interfaces.UserRepository;
import advanced.services.interfaces.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import utils.ModelFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;

    private Collection<User> expectedUserList;

    @BeforeEach
    void setUp() {
        this.expectedUserList = Collections.singletonList(ModelFactory.userMock());
    }

    @Test
    void getAll() {
        //Arrange
        when(this.userRepository.getModels())
                .thenReturn(this.expectedUserList);

        //Act
        final List<User> actualUserList = (List<User>) this.userService.getAll();

        //Assert
        Assertions.assertEquals(expectedUserList,actualUserList);
        Assertions.assertEquals(1,actualUserList.size());

        verify(this.userRepository, times(1)).getModels();

    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void getInstance() {
        final UserService instanceTestOne = UserServiceImpl.getInstance();
        final UserService instanceTestTwo = UserServiceImpl.getInstance();

        Assertions.assertSame(instanceTestOne, instanceTestTwo, "Instance has different memory addresses");
        System.out.println("UserService singleton is correctly implemented");
    }
}