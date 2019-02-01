package pl.zespolowka.logit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pl.zespolowka.logit.domain.model.KeyloggerMessage;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

import java.util.List;

@Repository
public interface KeyloggerMessageRepository extends JpaRepository<KeyloggerMessage, Integer> {

    List<KeyloggerMessage> findAllByKeyloggerUser(KeyloggerUser keyloggerUser);
}
