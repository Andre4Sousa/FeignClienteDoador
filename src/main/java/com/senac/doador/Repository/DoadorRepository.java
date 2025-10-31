package com.senac.doador.Repository;

import com.senac.doador.Entity.Doador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoadorRepository extends JpaRepository<Doador,Integer> {

}
