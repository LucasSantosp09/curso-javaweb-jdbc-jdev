package pos_java_jbdc.pos_java_jbdc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {
	
	 @Test public void initBanco() { UserPosDAO userPosDAO = new UserPosDAO();
	 Userposjava userposjava = new Userposjava();
	 
	 userposjava.setNome("Teste24");
	 userposjava.setEmail("teste3@gmail.com");
	 
	 userPosDAO.salvar(userposjava);
	
	 }
	 

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("---------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();

		try {
			Userposjava userposjava = dao.buscar(1);
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initAtualizar() {

		try {
			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(2);
			
			objetoBanco.setNome("Nome mudado com metodo atualizar2");
			dao.atualizar(objetoBanco);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void initDeletar() {
		try {
			
			UserPosDAO dao =  new UserPosDAO();
			dao.deletar(9);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testeInsertTelefone () {
		Telefone telefone = new Telefone ();
		telefone.setNumero("33333-3333");
		telefone.setTipo("Fixo");
		telefone.setUsuario(4);
		
		UserPosDAO dao = new UserPosDAO();
		dao.salvarTelefone(telefone);
	}
	
	@Test
	public void testeCarregaFoneUser () {
		
		UserPosDAO dao = new UserPosDAO();
		List<BeanUserFone> beanUserFones = dao.listaUserFone(1);
		for (BeanUserFone beanUserFone : beanUserFones) {
			System.out.println(beanUserFone);
		}
	}

}
