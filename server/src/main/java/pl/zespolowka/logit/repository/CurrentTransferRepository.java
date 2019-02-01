package pl.zespolowka.logit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zespolowka.logit.domain.model.CurrentTransfer;
import pl.zespolowka.logit.domain.model.KeyloggerUser;

import java.util.Optional;

@Repository
public interface CurrentTransferRepository extends JpaRepository<CurrentTransfer, Integer> {
    Optional<CurrentTransfer> findByKeyloggerUser(KeyloggerUser user);
}
