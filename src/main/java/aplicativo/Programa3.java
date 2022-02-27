package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa3 {

	public static void main(String[] args) {
		//Removendo uma Entidade no banco de dados.
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//Criando um EntityManager com os c�digos da emf
		EntityManager em = emf.createEntityManager();
		
		//Para remover uma entidade ela tem que estar monitorada. Ou voc� acabou de inserir ou 
		//� um objeto que voc� buscou antes de fechar o entity manager.
		
		//Buscando a entidade
		Pessoa p = em.find(Pessoa.class, 2);
		
		//Sempre que tem uma opera��o que n�o � uma simples consulta voc� deve colocar uma transa��o
		//Transa��o
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
