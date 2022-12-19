package ua.semkov.testapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.semkov.testapp.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
