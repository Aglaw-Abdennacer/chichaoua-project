package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseDao extends JpaRepository <Classe, Long >  {
    Classe findByCodeClasse(long codeClasse);
}
