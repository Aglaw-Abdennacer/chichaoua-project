package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Paye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayeDao extends JpaRepository <Paye, Long >  {
}
