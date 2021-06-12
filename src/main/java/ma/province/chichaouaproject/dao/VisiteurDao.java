package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Visiteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisiteurDao extends JpaRepository <Visiteur, Long > {
    Visiteur findByNumCin(long numCin) ;
    int deleteByNumCin(long numCin);

}
