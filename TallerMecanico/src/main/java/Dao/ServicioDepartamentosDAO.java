package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Modelos.Departamentos;
import Modelos.PeticionesCliente;

public class ServicioDepartamentosDAO implements DAO<Departamentos>{

	private List<Departamentos> listaDepartamentos=new ArrayList<>();
	@Override
	public Optional<Departamentos> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamentos> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Departamentos t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Departamentos t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Departamentos t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String enviarPeticion(PeticionesCliente te, String provincia) {
		String texto;
		//System.out.println("### AtenciÃ³n a todas las Unidades ###\n ## Emergencia: " + te.toString() + " en la provincia de " + provincia);
		texto="### Atencion a todas los departamentos ###\n ## Peticion: " + te.toString() + " en la ciudad de " + provincia +", porfavro acudan a recepcion\n";
		//unidadesActivas.stream().forEach(e -> e.llamadaEmergencias(te, provincia));
		
		for(Departamentos trabajador : listaDepartamentos) {
			
			texto = texto +trabajador.llamadaPedido(te, provincia);
			
		}
		return texto;
	}
}
