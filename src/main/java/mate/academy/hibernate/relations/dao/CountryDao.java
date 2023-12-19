package mate.academy.hibernate.relations.dao;

import java.util.Optional;
import mate.academy.hibernate.relations.model.Country;

public interface CountryDao {
    Country create(Country country);

    Optional<Country> getById(Long id);
}
