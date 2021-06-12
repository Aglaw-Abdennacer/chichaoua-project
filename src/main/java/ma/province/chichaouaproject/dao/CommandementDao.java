package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Commandement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandementDao extends JpaRepository <Commandement, Long >  {
    Commandement findByNomCommandementFR(String nomCommandementFR);
}
