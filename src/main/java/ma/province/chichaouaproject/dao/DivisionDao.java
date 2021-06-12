package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionDao extends JpaRepository <Division, Long >  {
    Division findByCodeDivision(long codeDivision);

}
