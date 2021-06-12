package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Cercle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CercleDao extends JpaRepository <Cercle, Long >  {

}
