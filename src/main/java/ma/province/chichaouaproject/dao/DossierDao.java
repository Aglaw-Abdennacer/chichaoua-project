package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DossierDao  extends JpaRepository<Dossier, Long > {
    Dossier findByNumDossier(long numDossier) ;
    int deleteByNumDossier(long numDossier) ;
    Dossier findByNomDossier(String nomDossier) ;
    int deleteByNomDossier(String nomDossier)  ;

}
