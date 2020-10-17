package br.com.zgsolucoes.devfest.micronaut.repository;

import br.com.zgsolucoes.devfest.micronaut.domain.Bacon;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface BaconRepository extends JpaRepository<Bacon, Long> {

}
