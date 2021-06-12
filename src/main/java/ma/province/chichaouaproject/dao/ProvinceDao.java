package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceDao extends JpaRepository <Province, Long >  {
}
