package com.brasilprev.desafiojava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brasilprev.desafiojava.model.Cliente;

/**
  * @author Regina Rodrigues
 * Anotação  @Repository são boas práticas para expor um repositório ao Spring boot
* */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>  {
	
	List<Cliente> findAllByNomeContainingIgnoreCase(String nome );

}
