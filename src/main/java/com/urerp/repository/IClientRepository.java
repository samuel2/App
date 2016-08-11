package com.urerp.repository;

import com.urerp.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by samuel on 11/08/16.
 */
public interface IClientRepository extends JpaRepository<Client, Long> {
}
