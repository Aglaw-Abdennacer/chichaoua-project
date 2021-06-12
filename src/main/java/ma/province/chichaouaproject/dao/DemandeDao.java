package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeDao extends JpaRepository <Demande, Long >  {
    Demande findBynumOrdre( long numOrdre);
    int deleteBynumOrdre( long numOrdre);
    List<Demande>  findByThemeNomThemeFR(String nomThemeFR);
    List<Demande>  findByStatutNomStatutFR(String nomStatutFR);
    List<Demande>  findByDivisionNomDivisionFR(String nomDivisionFR);
    List<Demande>  findByTypeDemandeNomTypeDemandeFR(String nomTypeDemandeFR);

}
