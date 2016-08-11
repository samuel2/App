package com.urerp.repository;

import com.urerp.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by samuel on 11/08/16.
 */
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}
