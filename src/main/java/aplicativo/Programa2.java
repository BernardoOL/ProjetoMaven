package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa2 {

	public static void main(String[] args) {
		// Buscando uma entidade no Banco de dados.

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		// Criando um EntityManager com os códigos da emf
		EntityManager em = emf.createEntityManager();

		//Buscando uma Pessoa
		Pessoa pessoa = em.find(Pessoa.class, 2);
		System.out.println(pessoa);

		System.out.println("Pronto");
		// Fechando o EntityManager
		em.close();
		// Fechando o EntityManagerFactory
		emf.close();
	}

}
