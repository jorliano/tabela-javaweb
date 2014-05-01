package modelo.dao;
 
import java.util.List;
import modelo.Pessoa;
import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import util.HibernateUtil;
import utilitarios.msg;
 
public class PessoaDao {
 
	private Session session; 
       
		public void inserir(Pessoa pessoa){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session.beginTransaction();
				session.save(pessoa);
				session.getTransaction().commit();
                                
			}finally{
                                new msg().comfirmar("Cliente cadastrado com sucesso "+pessoa.getNome());
				session.close();
 
			}
		}
 
		public void alterar(Pessoa pessoa){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.saveOrUpdate(pessoa);
				session.getTransaction().commit();
                                new msg().comfirmar("Dados foram alterados com exito ");
			}finally{
				session.close();
 
			}
		}
 
		public void excluir(Pessoa pessoa){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.delete(pessoa);
				session.getTransaction().commit();
                                new msg().comfirmar("Cliente Deletado "+pessoa.getNome());
			}finally{
				session.close();
 
			}
		}
                
              
                
 
		@SuppressWarnings("unchecked")
		public List  listar(){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				Criteria cri = session.createCriteria(Pessoa.class);
				return cri.list();
			}finally{
				session.close();
 
			}
		}
}