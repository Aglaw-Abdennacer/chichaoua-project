package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexeDao extends JpaRepository <Sexe, Long >  {
    Sexe findByCodeSexe(long codeSexe);
}
