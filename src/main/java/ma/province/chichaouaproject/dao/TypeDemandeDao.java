package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.TypeDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeDemandeDao extends JpaRepository<TypeDemande, Long > {

    TypeDemande findByCodeTypeDemande( long codeTypeDemande);
    int deleteByCodeTypeDemande ( long codeTypeDemande);


}
