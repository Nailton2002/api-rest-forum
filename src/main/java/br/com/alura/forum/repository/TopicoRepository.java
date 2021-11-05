package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//AQUI ESTOU ENTRANDO NA CLASE TOPICOS E NO ATRIBUTO QUE É UMA ENTIDADE DE RELACIONAMENTO CURSO PEGANDO O SEU NOME QUE É UM ATRIBUTO
	List<Topico> findByCursoNome(String nomeCurso);
	//COMO COLOCAMOS A ASSINATURA DO METODO O SPRING VAI GERA A QUERY AUTOMATICA
}
