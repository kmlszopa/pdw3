package pl.zespolowka.logit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.zespolowka.logit.domain.model.InternetSettings;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

import java.util.Optional;

import static pl.zespolowka.logit.configuration.LogITConsts.API_PATH;
import static pl.zespolowka.logit.configuration.LogITConsts.APPLICATION_JSON;

@Repository
public interface InternetSettingsRepository extends JpaRepository<InternetSettings, Integer> {
    Optional<InternetSettings> findByKeyloggerUser(KeyloggerUser keyloggerUser);
}
