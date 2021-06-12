package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Statut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutDao extends JpaRepository <Statut, Long >  {
    Statut findByCodeStatut (long codeStatut);
    Statut findByNomStatutFR (String nomStatutFR);
}
