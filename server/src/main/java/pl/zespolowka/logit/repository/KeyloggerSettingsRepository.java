package pl.zespolowka.logit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.zespolowka.logit.domain.model.KeyloggerSettings;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

import java.util.Optional;

@Repository
public interface KeyloggerSettingsRepository extends JpaRepository<KeyloggerSettings, Integer> {
    Optional<KeyloggerSettings> findByKeyloggerUser(KeyloggerUser keyloggerUser);
}
