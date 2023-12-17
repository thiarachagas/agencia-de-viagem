package br.com.dreamtravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dreamtravel.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

	
}
