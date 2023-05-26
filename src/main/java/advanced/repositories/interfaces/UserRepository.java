package advanced.repositories.interfaces;

import advanced.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

public interface UserRepository extends AppRepository<User,Long> {

    AtomicLong sequence = new AtomicLong(0);


    Collection<User> dataList = new ArrayList<>();
}
