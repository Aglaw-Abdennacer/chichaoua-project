package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.CommuneLocale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommuneLocaleDao extends JpaRepository <CommuneLocale, Long >  {
    CommuneLocale findByCodeCommuneLocale(long codeCommuneLocale);
    CommuneLocale findByNomCommuneLocaleFR(String nomCommuneLocaleFR);
}
