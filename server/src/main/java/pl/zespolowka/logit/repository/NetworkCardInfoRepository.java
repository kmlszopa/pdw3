package pl.zespolowka.logit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pl.zespolowka.logit.domain.model.KeyloggerUser;
import pl.zespolowka.logit.domain.model.NetworkCardInfo;

import java.util.Optional;

@Repository
public interface NetworkCardInfoRepository extends JpaRepository<NetworkCardInfo, Integer> {
    Optional<NetworkCardInfo> findByKeyloggerUser(KeyloggerUser keyloggerUser);

}
