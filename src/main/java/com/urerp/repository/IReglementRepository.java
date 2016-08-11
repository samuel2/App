package com.urerp.repository;

import com.urerp.domain.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by samuel on 11/08/16.
 */
public interface IReglementRepository extends JpaRepository<Reglement, Long> {
}
