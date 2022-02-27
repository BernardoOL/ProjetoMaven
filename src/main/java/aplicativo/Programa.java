package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		// Adicionando uma Entidade no Banco de Dados.

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

		// Conectando o emf aos códigos da persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		// Criando um EntityManager com os códigos da emf
		EntityManager em = emf.createEntityManager();

		// Sempre que tem uma operação que não é uma simples consulta você deve colocar
		// uma transação
		// Transação
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

		System.out.println("Pronto");
		// Fechando o EntityManager
		em.close();
		// Fechando o EntityManagerFactory
		emf.close();
	}

}
