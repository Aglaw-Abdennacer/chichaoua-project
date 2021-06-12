package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDao extends JpaRepository <Region, Long >  {
}
