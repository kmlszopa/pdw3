package pl.zespolowka.logit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

@Repository
public interface KeyloggerUserRepository extends JpaRepository<KeyloggerUser, Integer> {
}
