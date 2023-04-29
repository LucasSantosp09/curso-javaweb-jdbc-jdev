package pos_java_jbdc.pos_java_jbdc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;


public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(7);
		userposjava.setNome("Teste2");
		userposjava.setEmail("teste3@gmail.com");
		
		userPosDAO.salvar(userposjava);
		
	}
}
