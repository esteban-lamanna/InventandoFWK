import static org.junit.Assert.*;


import org.junit.Test;
import com.Entities.EntidadesDeNegocio.*;
import com.Esteban.Repository.*;
import com.Esteban.Repository.Implementations.ClienteRepository;

public class TestCliente {

	@Test
	public void test() {
		ClienteRepository repo = new ClienteRepository();		
		ClienteEntity entidad=  repo.Read((long) 1);
		assertNotNull(entidad);
		
	}

}
