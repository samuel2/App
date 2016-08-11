package com.urerp.repository;

import com.urerp.domain.Chambre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by samuel on 07/08/16.
 */
public interface IChambreRepository extends JpaRepository<Chambre, Long> {

    public List<Chambre> findByLibelle(String libelle);

    public Page<Chambre> findByLibelle(String libelle, Pageable page);

    public List<Chambre> findByType(String type);

    public Page<Chambre> findByType(String type, Pageable page);

    public List<Chambre> findByPosition(String position);

    public Page<Chambre> findByPosition(String position, Pageable page);

    public List<Chambre> findByPrix(Double prix);

    public Page<Chambre> findByPrix(Double prix, Pageable page);

    @Query("SELECT c FROM Chambre c WHERE c.libelle LIKE :val")
    public Page<Chambre> findChambreByMotCle(@Param("val") String valeur, Pageable page);
}
