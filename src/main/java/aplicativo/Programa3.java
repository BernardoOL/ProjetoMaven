package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa3 {

	public static void main(String[] args) {
		//Removendo uma Entidade no banco de dados.
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//Criando um EntityManager com os códigos da emf
		EntityManager em = emf.createEntityManager();
		
		//Para remover uma entidade ela tem que estar monitorada. Ou você acabou de inserir ou 
		//é um objeto que você buscou antes de fechar o entity manager.
		
		//Buscando a entidade
		Pessoa p = em.find(Pessoa.class, 2);
		
		//Sempre que tem uma operação que não é uma simples consulta você deve colocar uma transação
		//Transação
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		//Fechando o EntityManager
		em.close();
		//Fechando o EntityManagerFactory
		emf.close();
	}
	
}
