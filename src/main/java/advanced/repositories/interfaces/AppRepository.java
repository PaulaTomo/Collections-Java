package advanced.repositories.interfaces;

import advanced.models.BaseModel;

import java.util.Collection;
import java.util.Optional;

public interface AppRepository <M extends BaseModel, I extends Number> {

    Collection<M> getModels();

    Optional<M> getById(I id);

    M save(M m);
}
