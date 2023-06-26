package br.com.sinqia.service.db.postgres.repositories;

import br.com.sinqia.service.db.postgres.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    CustomerEntity findByCode(String code);
}
